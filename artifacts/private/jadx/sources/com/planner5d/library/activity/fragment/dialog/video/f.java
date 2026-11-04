package com.planner5d.library.activity.fragment.dialog.video;

import android.net.Uri;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import androidx.lifecycle.l1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class f extends f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f133099e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l1 f133100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1<Long> f133101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f133102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c1<Uri> f133103d;

    @gg.b
    public interface a extends com.planner5d.library.services.utility.f<f> {
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.video.VideoPlayerViewModel$processVimeoUri$1", f = "VideoPlayerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133104a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f133106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Uri uri, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f133106c = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new b(this.f133106c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f133104a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            f.this.f133103d.r(this.f133106c);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @gg.c
    public f(@gg.a @NotNull l1 savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.f133100a = savedStateHandle;
        this.f133101b = savedStateHandle.g("position", 0L);
        this.f133102c = savedStateHandle.g("playing", Boolean.TRUE);
        this.f133103d = savedStateHandle.g("video-uri", null);
    }

    public final long V() {
        Long lF = this.f133101b.f();
        if (lF != null) {
            return lF.longValue();
        }
        return 0L;
    }

    @NotNull
    public final androidx.lifecycle.w0<Uri> W() {
        return this.f133103d;
    }

    public final void X(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (this.f133103d.f() != null) {
            return;
        }
        k.f(g2.a(this), null, null, new b(uri, null), 3, null);
    }

    public final void Y(long j10, boolean z10) {
        this.f133101b.r(Long.valueOf(j10));
        this.f133102c.r(Boolean.valueOf(z10));
    }

    public final boolean Z() {
        Boolean boolF = this.f133102c.f();
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return true;
    }
}
