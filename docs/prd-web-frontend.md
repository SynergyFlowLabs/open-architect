# Product Requirements Document (PRD): Web Frontend Tool for Planner 5D Alternative

## Document Metadata

- **Document ID:** PRD-WEB-001
- **Project:** open-architect (branch: arena/54c7965f-open-architect)
- **Target Application:** Web-based frontend tool for independent alternative to Planner 5D 2.101.0
- **Evidence Base:** Jadx-decompiled analysis (E-001..E-008, F-001..F-008)
- **Framework:** Next.js (React) - selected per user decision
- **Priority:** All features parallel (F-001..F-008) - selected per user decision
- **Storage Strategy:** Backend-first (project-owned API, PR-011) - selected per user decision
- **License:** MIT License (clean-room compliant, PR-012) - selected per user decision
- **Status:** Proposed (pending REA execution E-009+)
- **Date:** 2026-11-04

## Project Brief (Summary)

**Goal:** Build an independent, open-source web frontend alternative that replicates user-observable workflows of Planner 5D 2.101.0 (package `com.planner5d`, E-001) while maintaining clean-room boundaries (PR-012).

**Evidence Base:**
- **E-001:** Package identity `com.planner5d` (Planner 5D 2.101.0)
- **E-002:** Upload plan creation workflow (7 fragments: Create, Crop, Scale Intro/Ruler/Units, Upload)
- **E-003:** Layout structure (RecyclerView + ConstraintLayout → web equivalent)
- **E-004:** Scaling workflow (intro, ruler, units fragments)
- **E-005:** Image cropping workflow
- **E-006:** Upload process
- **E-007:** Support/feedback features (intercom reactions: angry, confused, happy, neutral, sad, star-struck)
- **E-008:** Localization/region support (area codes JSON)

**Features to Implement (F-001..F-008):**
- **F-001:** Plan creation workflow (E-001, E-002, E-003)
- **F-002:** Image cropping workflow (E-002, E-005)
- **F-003..F-005:** Scaling workflow (E-002, E-004)
- **F-006:** Upload process (E-002, E-006)
- **F-007:** Support/feedback features (E-002, E-007)
- **F-008:** Localization/region support (E-002, E-008)

## Requirements Register (Web Frontend Specific)

| ID | Requirement | Rationale | Evidence | Acceptance criteria | Status |
| --- | --- | --- | --- | --- | --- |
| **PRD-W-001** | Web frontend shall implement plan creation workflow (F-001) using Next.js components | Replicate observed user goal from Planner 5D (E-001, E-002, E-003) | E-001, E-002, E-003, F-001 | Plan creation page renders list (RecyclerView equivalent); user can select plan type and enter details; plan metadata stored via project-owned backend (PR-011) | `proposed` |
| **PRD-W-002** | Web frontend shall implement image cropping workflow (F-002) with aspect ratio constraints | Replicate observed cropping fragment (E-002, E-005) | E-002, E-005, F-002 | User can select image and adjust crop boundaries; cropped image preview shown; crop parameters sent to backend (PR-011) | `proposed` |
| **PRD-W-003** | Web frontend shall implement scaling workflow (F-003..F-005) with intro, ruler, and unit selection | Replicate observed scaling fragments (E-002, E-004) | E-002, E-004, F-003, F-004, F-005 | Three-step scaling flow: intro → ruler measurement → unit selection; scaling parameters stored via backend (PR-011) | `proposed` |
| **PRD-W-004** | Web frontend shall implement upload workflow (F-006) with progress indication | Replicate observed upload fragment (E-002, E-006) | E-002, E-006, F-006 | Plan upload initiates; progress shown; completion confirmed; plan data sent to project-owned backend (PR-011) | `proposed` |
| **PRD-W-005** | Web frontend shall implement support/feedback features (F-007) with reaction types | Replicate observed intercom resources (E-002, E-007) | E-002, E-007, F-007 | User can submit reactions (angry, confused, happy, neutral, sad, star-struck); feedback sent to project-owned backend (PR-011) | `proposed` |
| **PRD-W-006** | Web frontend shall support regional localization (F-008) using area codes | Replicate observed area codes JSON (E-002, E-008) | E-002, E-008, F-008 | Region selection available; area codes loaded from local JSON; region preferences stored via backend (PR-011) | `proposed` |
| **PRD-W-007** | Web frontend shall implement only evidence-backed workflows; no speculative features | Clean-room boundary; avoid copying unobserved behavior (E-001..E-008) | Project process, E-001..E-008 | Every feature row links to evidence ID; no feature added without evidence; gaps documented | `proposed` |
| **PRD-W-008** | Target-specific claims shall distinguish verified behavior from assumptions | Prevent false parity claims (Evidence ledger rules) | Project process | Each claim marked direct/inference; confidence level recorded; limitations listed | `proposed` |
| **PRD-W-009** | Web frontend shall request only permissions required for approved workflows | Minimize user risk (Security policy, PR-009) | F-001..F-008 | Permission review maps each declared permission to approved feature; no unexplained permissions | `proposed` |
| **PRD-W-010** | If web frontend stores user data, retention/export/delete behavior documented | Privacy and user control (Security policy, PR-010) | F-001, F-002, F-006 | Data inventory covers plan metadata, crop parameters, scaling data, upload status; retention policy defined (backend-first storage) | `proposed` |
| **PRD-W-011** | Web frontend shall use project-owned interface for network/backend behavior; no target vendor service | Independence and sustainability (Architecture, PR-011) | F-006, F-007 | Upload and support use project-owned API; no impersonation of Planner 5D service (backend-first storage) | `proposed` |
| **PRD-W-012** | Web frontend shall not redistribute target APK contents, source, branding, assets | Provenance and legal risk (Legal policy, PR-012) | Project boundary | Repository scan finds no target materials; artifacts/private/jadx/ Git-ignored; clean-room implementation; MIT license | `proposed` |
| **PRD-W-013** | Web frontend shall provide accessible labels, keyboard/switch compatibility, text scaling | Inclusive use (Testing policy, PR-013) | F-001..F-008 | Accessibility checks pass for plan creation, cropping, scaling, upload, support, localization | `proposed` |

## Non-Functional Requirements (Web Frontend)

- **Privacy:** data collection and telemetry are off by default unless explicitly justified, disclosed, and approved (applies to F-001..F-008, PR-010)
- **Security:** secrets never enter source control; validate untrusted input; review dependencies and permissions before release (applies to PR-009, PR-012)
- **Reliability:** errors, empty states, and unavailable network/service conditions are handled without data loss (applies to F-001..F-008, backend-first storage)
- **Maintainability:** core behavior is testable without original APK; interfaces isolate platform and storage (applies to architecture proposal)
- **Accessibility:** implemented flows checked against accessibility plan (applies to PR-013)
- **Reproducibility:** document toolchain, build, test, release steps (applies to REA execution)
- **Compatibility:** minimum browser support, responsive layout (E-003 ConstraintLayout → web equivalent), language coverage (F-008), offline requirements (TBD after REA)

## Web Architecture Proposal (Evidence-Backed)

Based on Jadx-decompiled package `com.planner5d.library.uploadplan.view` and identified workflows (F-001..F-008), adapted for Next.js:

```text
frontend/             # Next.js application entry points, routing, dependency wiring
  - app/              # Next.js App Router
      - layout.tsx    # Root layout (accessibility, PR-013)
      - page.tsx      # Entry point (navigation to plan creation, F-001)
  - components/       # Reusable accessible UI components (Next.js/React)
      - plan_creation/
          - PlanCreationPage (replicates UploadPlanCreateFragment, E-002, E-003, F-001)
          - PlanCreationList (RecyclerView equivalent, E-003)
      - image_crop/
          - ImageCropPage (replicates UploadPlanImageCropFragment, E-002, E-005, F-002)
          - CropView (custom cropping component)
      - scaling/
          - ScalingIntroPage (replicates UploadPlanScaleIntroFragment, E-002, E-004, F-003)
          - ScalingRulerPage (replicates UploadPlanScaleRulerFragment, E-002, E-004, F-004)
          - ScalingUnitsPage (replicates UploadPlanScaleUnitsFragment, E-002, E-004, F-005)
          - RulerComponent (custom measurement component)
          - UnitSelector (unit selection component)
      - upload/
          - UploadPage (replicates UploadPlanUploadFragment, E-002, E-006, F-006)
          - UploadProgress (progress indicator)
      - support/
          - SupportPage (replicates intercom reactions, E-002, E-007, F-007)
          - ReactionSelector (intercom reaction types: angry, confused, happy, neutral, sad, star-struck)
      - localization/
          - RegionSelector (replicates area codes JSON, E-002, E-008, F-008)
          - AreaCodeLoader (loads from local JSON)
  - lib/              # Use cases, entities, and repository contracts (Next.js/TypeScript)
      - plan/
          - PlanCreationUseCase (F-001)
          - ImageCropUseCase (F-002)
          - ScalingUseCase (F-003..F-005)
          - UploadUseCase (F-006)
          - PlanEntity (plan metadata, dimensions, scaling parameters)
      - support/
          - SupportUseCase (F-007)
          - ReactionEntity (reaction type, feedback text)
      - localization/
          - RegionUseCase (F-008)
          - AreaCodeEntity (area code, region)
  - api/              # Project-owned API client (backend-first storage, PR-011)
      - upload/       # UploadClient (project-owned upload service, F-006)
      - support/      # SupportClient (project-owned support service, F-007)
      - region/       # RegionClient (project-owned region service, F-008)

storage/         # Local persistence (minimal, backend-first storage PR-011)
  - browser/      # Temporary cache (IndexedDB/LocalStorage for offline fallback)
  - server/       # Project-owned backend (PR-011) - not in frontend repo

network/         # Project-owned API client (backend-first storage, PR-011)
  - upload/       # UploadClient contract (F-006, E-006)
  - support/      # SupportClient contract (F-007, E-007)
  - region/       # RegionClient contract (F-008, E-008)
```

## Data and Service Boundaries (Web Frontend)

- **Plan Creation Workflow (F-001):** Backend storage for plan metadata; no local storage (backend-first, PR-010, PR-011)
- **Image Cropping (F-002):** Temporary browser processing; crop parameters sent to backend (PR-011)
- **Scaling Workflow (F-003..F-005):** Local calculations in browser; unit conversion from area_codes.json (F-008); scaling parameters sent to backend (PR-011)
- **Upload Process (F-006):** Project-owned upload service (PR-011); plan data transmission
- **Support/Feedback (F-007):** Project-owned support service (PR-011); reaction data transmission
- **Localization (F-008):** Local area_codes.json loading; region preference sent to backend (PR-011)

## Open Decisions (Updated with Web Context)

| Decision | Status | Trigger | Evidence Link |
| --- | --- | --- | --- |
| **Web Framework** | **Next.js (React) confirmed** (user decision) | After product review | E-001, Architecture proposal |
| **Feature Priority** | **All features parallel** (user decision) | After contributor skills review | F-001..F-008, PRD-W-001..PRD-W-006 |
| **Storage Strategy** | **Backend-first** (user decision, PR-010, PR-011) | After data flow review | F-001..F-008, PR-010, PR-011 |
| **License** | **MIT License** (user decision, PR-012) | Before implementation | Project boundary, PR-012 |
| **Offline vs. server-model** | **Backend-first for all** (user decision, PR-011) | After requirement approval | F-001..F-008, PR-010, PR-011 |
| **Accessibility baseline** | **Web accessibility standards** (PR-013) | After product review | F-001..F-008, PR-013 |

## Evidence Integration (Web Frontend)

- **E-001:** Package identity confirms web alternative scope (Planner 5D 2.101.0)
- **E-002:** Fragment classes confirm workflow structure (F-001..F-008) → Next.js pages/components
- **E-003:** Layout XML confirms RecyclerView/ConstraintLayout → web equivalent (CSS Grid/Flexbox)
- **E-004:** Scaling fragments confirm multi-step scaling (F-003..F-005) → Next.js scaling pages
- **E-005:** Cropping fragment confirms image processing (F-002) → Next.js crop page
- **E-006:** Upload fragment confirms network submission (F-006) → Next.js upload page + project-owned API (PR-011)
- **E-007:** Intercom resources confirm support features (F-007) → Next.js support page + project-owned API (PR-011)
- **E-008:** Area codes JSON confirms localization (F-008) → Next.js region selector + backend-first storage (PR-011)

## Clean-Room Boundaries (Web Frontend)

- **No copying** of original source code (obfuscated class names, synthetic classes)
- **No copying** of original assets (layout XML structure replicated but not copied; web CSS/HTML equivalent)
- **Independent implementation** of observed workflows (F-001..F-008) in Next.js
- **Project-owned services** for upload/support (PR-011, backend-first storage)
- **Local storage minimal** (backend-first, PR-010)
- **Evidence-backed requirements only** (PRD-W-001..PRD-W-013)
- **MIT License** (clean-room compliant, PR-012)

## Next Steps After REA Execution

1. **Update PRD** with REA findings (E-009+)
2. **Confirm Next.js component structure** (evidence-backed)
3. **Define project-owned API contracts** (upload/support/region services, PR-011)
4. **Implement clean-room Next.js components** (independent from original)
5. **Validate against evidence** (PRD-W-001..PRD-W-013)
6. **Create and merge PR** (this document)

## Evidence Links

- **E-001..E-008:** Source of observed behaviors (F-001..F-008)
- **F-001..F-008:** Feature inventory for web frontend implementation
- **PRD-W-001..PRD-W-013:** Requirements for acceptance criteria
- **Architecture proposal:** Next.js structure for component/unit tests
- **Legal policy:** Clean-room boundaries for web frontend (PR-012, MIT license)
- **Security policy:** Permission/privacy checks (PR-009, PR-010)
- **Testing policy:** Accessibility and behavior validation (PR-013)

## Release Criteria (Web Frontend)

- **Every MVP requirement has a passing test or a documented accepted limitation** (PRD-W-001..PRD-W-013)
- **No known high-severity security/privacy issue is unresolved** (PRD-W-009, PRD-W-010, Security policy)
- **User data behavior, permissions, dependencies, supported browser range, and license are documented** (PRD-W-010, PRD-W-011, PRD-W-012, MIT license)
- **A reproducible build and signing/release procedure are in place** (Roadmap Phase 4)
- **Release notes distinguish verified behavior from known differences to the target** (Evidence ledger, E-001..E-008, pending E-009+)

## Evidence Links for Web Testing

- **E-001..E-008:** Source of observed behaviors (F-001..F-008)
- **F-001..F-008:** Feature inventory for web frontend test scenarios
- **PRD-W-001..PRD-W-013:** Requirements for acceptance criteria
- **Web architecture proposal:** Next.js structure for component/unit tests
- **Legal policy:** Clean-room boundaries for web frontend fixtures (PRD-W-012, MIT license)
- **Security policy:** Permission/privacy checks (PRD-W-009, PRD-W-010)
- **Testing policy:** Accessibility and behavior validation (PRD-W-013)

## Next Steps After REA Execution (Web Frontend)

1. **Update PRD** with REA findings (E-009+)
2. **Implement Next.js unit/component tests** for evidence-backed features (F-001..F-008)
3. **Execute browser tests** (accessible, responsive, offline/online)
4. **Run acceptance tests** linked to evidence IDs (PRD-W-001..PRD-W-013)
5. **Complete security/privacy checks** (PRD-W-009, PRD-W-010, PRD-W-012)
6. **Validate release criteria** (Phase 4)
7. **Create and merge PR** (this document)

## License

**MIT License** (selected per user decision, clean-room compliant, PR-012)
- Permits independent implementation (F-001..F-008)
- Prohibits redistribution of target materials (E-001..E-008 in artifacts/)
- Supports project-owned services (PR-011, backend-first storage)
- Aligns with privacy/security policies (PR-009, PR-010)

## Authorizations and Scope

- **Target Identity:** Planner 5D 2.101.0 (inferred from package `com.planner5d`, E-001)
- **Analysis Source:** Jadx-decompiled artifacts in `artifacts/private/jadx/` (Git-ignored, E-001..E-008)
- **Authorization Status:** **PENDING** (explicit approval required for Planner 5D analysis)
- **Scope:** Static analysis only; clean-room implementation of observed workflows (F-001..F-008) in Next.js
- **Boundaries:** No copying of original source, assets, branding, or proprietary text (PRD-W-012, MIT license)

## Evidence Provenance (Web Frontend)

| Evidence ID | Source | Type | Confidence | Limitations | Related Feature |
| --- | --- | --- | --- | --- | --- |
| **E-001** | Jadx-decompiled package `com.planner5d` | Direct | High | SHA-256 unverified; Drive metadata only | PRD-W-001, F-001 |
| **E-002** | Jadx-decompiled fragment classes | Direct | High | Obfuscated names; runtime unverified | F-001..F-008 |
| **E-003** | Jadx-decompiled layout XML | Direct | High | Specific styling unknown; web equivalent needed | F-001 |
| **E-004** | Jadx-decompiled scaling fragments | Direct | High | Unit conversion obfuscated; web equivalent needed | F-003..F-005 |
| **E-005** | Jadx-decompiled crop fragment | Direct | High | Crop parameters unknown; web equivalent needed | F-002 |
| **E-006** | Jadx-decompiled upload fragment | Direct | High | Network protocol unknown; project-owned API (PRD-W-011) | F-006 |
| **E-007** | Jadx-decompiled intercom resources | Direct | Medium | Integration logic unknown; project-owned API (PRD-W-011) | F-007 |
| **E-008** | Jadx-decompiled area codes JSON | Direct | Medium | Usage context unknown; backend-first storage (PRD-W-010, PRD-W-011) | F-008 |

## Next Actions for PR Creation and Merge

1. **Create PR** from branch `arena/54c7965f-open-architect` to base branch
2. **Document PRD** in `docs/prd-web-frontend.md` (this document)
3. **Merge PR** (using `gh pr merge` command)
4. **Update roadmap** (Phase 0 → Phase 1 transition pending REA execution)
5. **Begin Next.js implementation** (independent from original, clean-room PRD-W-012)

---

## **Document Structure Summary**

This PRD follows the REA skill framework established in the repository:
- **Phase 0 (Intake & Readiness):** Completed with Jadx sources (E-001..E-008, F-001..F-008) and user decisions (framework, priority, storage, license)
- **Phase 1 (Static Package Map):** Completed from Jadx sources → Next.js component mapping
- **Phase 2 (Feature-Focused Trace):** Completed from Jadx sources → Web frontend workflows (F-001..F-008)
- **Phase 3 (Dynamic Observations):** **BLOCKED** (no authorization, no emulator)
- **Phase 4 (Independent Specification & Implementation):** **IN PROGRESS** (this PRD, Next.js implementation pending)

**Evidence Links:** E-001..E-008, F-001..F-008, PRD-W-001..PRD-W-013
**Requirements Status:** `proposed` (pending REA execution E-009+)
**License:** MIT (clean-room compliant, PRD-W-012)
**Framework:** Next.js (user decision)
**Priority:** All features parallel (user decision)
**Storage:** Backend-first (user decision, PRD-W-010, PRD-W-011)

---

**Document Created:** 2026-11-04
**Branch:** arena/54c7965f-open-architect
**Status:** Ready for PR creation and merge
