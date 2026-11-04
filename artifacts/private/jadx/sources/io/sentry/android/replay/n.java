package io.sentry.android.replay;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f304954b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private volatile o f304955a = o.INITIAL;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f304956a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f304956a = iArr;
        }
    }

    @NotNull
    public final o a() {
        return this.f304955a;
    }

    public final boolean b(@NotNull o newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i10 = (6 << 1) ^ 0;
        switch (a.f304956a[this.f304955a.ordinal()]) {
            case 1:
                return newState == o.STARTED || newState == o.CLOSED;
            case 2:
                return newState == o.PAUSED || newState == o.STOPPED || newState == o.CLOSED;
            case 3:
                return newState == o.PAUSED || newState == o.STOPPED || newState == o.CLOSED;
            case 4:
                return newState == o.RESUMED || newState == o.STOPPED || newState == o.CLOSED;
            case 5:
                return newState == o.STARTED || newState == o.CLOSED;
            case 6:
                return false;
            default:
                throw new k0();
        }
    }

    public final boolean c() {
        return this.f304955a == o.STARTED || this.f304955a == o.RESUMED;
    }

    public final void d(@NotNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        this.f304955a = oVar;
    }
}
