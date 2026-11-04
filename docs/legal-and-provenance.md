# Legal, licensing, and provenance

This document records project boundaries and questions for maintainers. It is not legal advice; reverse-engineering and interoperability rules vary by jurisdiction and by the software's license/terms. Obtain qualified legal review where needed.

## Authorization and scope

- Analyze only a specific artifact the requester is authorized to inspect.
- Record the source, exact build/hash, authorization, purpose, and exclusions privately where appropriate.
- Do not access accounts, private services, or third-party systems beyond the approved scope.
- Do not circumvent DRM, licensing, authentication, anti-abuse, or other access controls. Stop if an intended behavior depends on bypassing them.
- If ownership, permission, or terms are unclear, pause and resolve that before analysis or distribution.

## Independent implementation boundary

The project may document and implement independently observed user-facing behavior. It must not copy or redistribute the target's source, decompiled code, binaries, icons, screenshots, names, logos, proprietary text, private data, keys, or other protected material without documented permission. Create original code, visual design, wording, identifiers, and assets. Link each target-derived functional requirement to sanitized evidence; retain full private analysis output outside Git.

A clean-room process does not guarantee legal clearance. Keep a provenance record for project code, assets, dependencies, and observed behavior and seek legal review before public release if there is uncertainty.

## Third-party provenance

- REA is an external analysis tool from [morluto/rea](https://github.com/morluto/rea); this repository does not vendor REA source.
- Record the source/version/license for every dependency and third-party asset added to the alternative.
- Do not add target artifacts or bundled JADX/Android tooling binaries to Git without separate rights, licensing, and supply-chain review.

## Open-source license decision

**Pending. No `LICENSE` file exists.** A public Git repository without an explicit license is not automatically open source. Before accepting broad contributions or distributing builds, maintainers should choose a license, add its canonical `LICENSE` text, state the SPDX identifier, and review dependency compatibility.

Decision factors include desired downstream reuse, patent grant needs, attribution requirements, and compatibility with chosen dependencies. MIT and Apache-2.0 are common permissive options, but no choice is made here. Do not claim this repository is open source until the license is selected and added.

## Record to complete before release

- Chosen project license and SPDX ID: TBD.
- Contributor rights / DCO or CLA policy: TBD.
- Name, logo, and domain clearance: TBD.
- Third-party dependency and asset inventory: TBD.
- Target analysis authorization and retention policy: TBD.
- Jurisdiction-specific legal review: TBD.
