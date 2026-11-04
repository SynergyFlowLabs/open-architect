package com.planner5d.library.walls;

import com.planner5d.library.math.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface Wall {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int MAXIMUM_WIDTH = 1000;
    public static final int MINIMUM_WIDTH = 5;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int MAXIMUM_WIDTH = 1000;
        public static final int MINIMUM_WIDTH = 5;

        private Companion() {
        }
    }

    float getHeight();

    int getMinimumWidth();

    @NotNull
    k getOrigin(@NotNull k kVar);

    @NotNull
    k getPoint(@NotNull k kVar, boolean z10, boolean z11);

    float getWidth();

    boolean isHidden();

    boolean isZero();
}
