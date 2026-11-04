package com.planner5d.library.uploadplan.application;

import com.planner5d.library.interactor.j0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.u1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@fg.h
public final class h {
    @fg.i
    @NotNull
    public final ke.a a(@NotNull com.planner5d.library.uploadplan.interactor.a checkUploadQueueInteractor) {
        Intrinsics.checkNotNullParameter(checkUploadQueueInteractor, "checkUploadQueueInteractor");
        return checkUploadQueueInteractor;
    }

    @fg.i
    @NotNull
    public final ke.b b(@NotNull com.planner5d.library.uploadplan.interactor.e chooseImageAndSaveToPngInteractor) {
        Intrinsics.checkNotNullParameter(chooseImageAndSaveToPngInteractor, "chooseImageAndSaveToPngInteractor");
        return chooseImageAndSaveToPngInteractor;
    }

    @fg.i
    @NotNull
    public final ke.c c(@NotNull com.planner5d.library.uploadplan.interactor.h clearFailedTasksInteractor) {
        Intrinsics.checkNotNullParameter(clearFailedTasksInteractor, "clearFailedTasksInteractor");
        return clearFailedTasksInteractor;
    }

    @fg.i
    @NotNull
    public final ke.d d(@NotNull com.planner5d.library.uploadplan.interactor.j copyFromUriInteractor) {
        Intrinsics.checkNotNullParameter(copyFromUriInteractor, "copyFromUriInteractor");
        return copyFromUriInteractor;
    }

    @fg.i
    @NotNull
    public final le.a e(@NotNull com.planner5d.library.interactor.a interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        return interactor;
    }

    @fg.i
    @NotNull
    public final com.planner5d.library.model.manager.uploadplan.g f(@NotNull com.planner5d.library.model.manager.uploadplan.d databaseRepository) {
        Intrinsics.checkNotNullParameter(databaseRepository, "databaseRepository");
        return databaseRepository;
    }

    @fg.i
    @NotNull
    public final ke.e g(@NotNull com.planner5d.library.uploadplan.interactor.l detectPlanInteractor) {
        Intrinsics.checkNotNullParameter(detectPlanInteractor, "detectPlanInteractor");
        return detectPlanInteractor;
    }

    @fg.i
    @NotNull
    public final ke.f h(@NotNull com.planner5d.library.uploadplan.interactor.p loadPngInteractor) {
        Intrinsics.checkNotNullParameter(loadPngInteractor, "loadPngInteractor");
        return loadPngInteractor;
    }

    @fg.i
    @NotNull
    public final u1 i(@NotNull t1 logRecordManager) {
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        return logRecordManager;
    }

    @fg.i
    @NotNull
    public final le.m j(@NotNull j0 savePngInteractor) {
        Intrinsics.checkNotNullParameter(savePngInteractor, "savePngInteractor");
        return savePngInteractor;
    }

    @fg.i
    @NotNull
    public final ke.h k(@NotNull com.planner5d.library.uploadplan.interactor.r uploadPlanInteractor) {
        Intrinsics.checkNotNullParameter(uploadPlanInteractor, "uploadPlanInteractor");
        return uploadPlanInteractor;
    }
}
