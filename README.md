# BuildOpt Pilot

Owner-controlled synthetic Gradle repository for BuildOpt POC validation.
It provides a stable workload for causal cache, runtime-policy, patch, and
failure-safety experiments without depending on an external project.

## Workload

- Gradle 9.6.1 Wrapper with its distribution SHA-256 pinned.
- Java 17 toolchain and Kotlin DSL.
- Seven linearly dependent libraries plus one application.
- 64 deterministic workload classes and eight JUnit test classes.
- One cacheable custom manifest task implemented in `buildSrc`.
- Reproducible JAR and distribution ZIP outputs.
- Configuration Cache and local Build Cache enabled.

The declared pilot command is:

```bash
./gradlew --no-daemon clean pilotBuild
```

The required deliverables are:

- `app/build/libs/app-1.0.0.jar`
- `app/build/distributions/app-1.0.0.zip`
- `build/pilot/manifest.txt`

Run the repository conformance check with:

```bash
./dev/check
```

## Try the public BuildOpt onboarding

Install the public release, then run the same workload through BuildOpt:

```bash
curl --fail --silent --show-error --location \
  --output buildopt-install.sh \
  https://raw.githubusercontent.com/tonyredondo/buildopt/main/install.sh
bash buildopt-install.sh --version 0.1.1
export PATH="$HOME/.local/bin:$PATH"
buildopt doctor
buildopt gradle --no-daemon clean pilotBuild
```

The GitHub workflow performs the equivalent clean-room test through the
published BuildOpt Action and verifies all three deliverables.

## BuildOpt boundary

[`buildopt-pilot.json`](./buildopt-pilot.json) pins the exact BuildOpt source
revision, runner class, workload, and deliverables used by the pilot. GitHub CI
is an authoritative baseline with no BuildOpt credential and read-only
permissions. The first `PRIVATE_BETA_ISOLATED` deployment is installed and
operated outside the repository; no release key, cache token, state database,
or diagnostic export belongs in Git.

This repository is a POC fixture. It does not claim production readiness,
external-user evidence, or an eight-hour soak.
