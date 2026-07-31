package dev.buildopt.pilot;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.tasks.CacheableTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

@CacheableTask
public abstract class GeneratePilotManifest extends DefaultTask {
    @Input
    public abstract ListProperty<String> getEntries();

    @OutputFile
    public abstract RegularFileProperty getOutputFile();

    @TaskAction
    public void generate() throws IOException {
        List<String> entries = new ArrayList<>(getEntries().get());
        Collections.sort(entries);
        Path output = getOutputFile().get().getAsFile().toPath();
        Files.createDirectories(output.getParent());
        Files.write(output, entries, StandardCharsets.UTF_8);
    }
}
