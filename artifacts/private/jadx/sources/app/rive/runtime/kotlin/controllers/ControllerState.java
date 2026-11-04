package app.rive.runtime.kotlin.controllers;

import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ControllerStateManagement
public final class ControllerState {

    @NotNull
    private final Artboard activeArtboard;

    @NotNull
    private final List<LinearAnimationInstance> animations;

    @NotNull
    private final File file;
    private final boolean isActive;

    @NotNull
    private final HashSet<LinearAnimationInstance> playingAnimations;

    @NotNull
    private final HashSet<StateMachineInstance> playingStateMachines;

    @NotNull
    private final List<StateMachineInstance> stateMachines;

    public ControllerState(@NotNull File file, @NotNull Artboard activeArtboard, @NotNull List<LinearAnimationInstance> animations, @NotNull HashSet<LinearAnimationInstance> playingAnimations, @NotNull List<StateMachineInstance> stateMachines, @NotNull HashSet<StateMachineInstance> playingStateMachines, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(activeArtboard, "activeArtboard");
        Intrinsics.checkNotNullParameter(animations, "animations");
        Intrinsics.checkNotNullParameter(playingAnimations, "playingAnimations");
        Intrinsics.checkNotNullParameter(stateMachines, "stateMachines");
        Intrinsics.checkNotNullParameter(playingStateMachines, "playingStateMachines");
        this.file = file;
        this.activeArtboard = activeArtboard;
        this.animations = animations;
        this.playingAnimations = playingAnimations;
        this.stateMachines = stateMachines;
        this.playingStateMachines = playingStateMachines;
        this.isActive = z10;
    }

    public final void dispose() {
        this.file.release();
        this.activeArtboard.release();
    }

    @NotNull
    public final Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    @NotNull
    public final List<LinearAnimationInstance> getAnimations() {
        return this.animations;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        return this.playingAnimations;
    }

    @NotNull
    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        return this.playingStateMachines;
    }

    @NotNull
    public final List<StateMachineInstance> getStateMachines() {
        return this.stateMachines;
    }

    public final boolean isActive() {
        return this.isActive;
    }
}
