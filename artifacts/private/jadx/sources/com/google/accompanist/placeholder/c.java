package com.google.accompanist.placeholder;

import androidx.annotation.x;
import androidx.compose.animation.core.g1;
import androidx.compose.runtime.k7;
import androidx.compose.ui.graphics.i0;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@k7
@l(message = "\naccompanist/placeholder is deprecated and the API is no longer maintained. \nWe recommend forking the implementation and customising it to your needs. \nFor more information please visit https://google.github.io/accompanist/placeholder\n")
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f103143a = a.f103144a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f103144a = new a();

        private a() {
        }
    }

    @NotNull
    i0 a(@x(from = 0.0d, to = 1.0d) float f10, long j10);

    @Nullable
    g1<Float> b();

    @x(from = 0.0d, to = 1.0d)
    float c(float f10);
}
