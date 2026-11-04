package com.planner5d.library.activity.helper.event.content;

import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public enum e {
    None(0, 0),
    SlideLeft(com.planner5d.library.view.d.a.R, com.planner5d.library.view.d.a.S),
    SlideRight(com.planner5d.library.view.d.a.Q, com.planner5d.library.view.d.a.T);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f136806g = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f136807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f136808b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136809a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.SlideLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.SlideRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f136809a = iArr;
        }
    }

    e(int i10, int i11) {
        this.f136807a = i10;
        this.f136808b = i11;
    }

    @NotNull
    public static kotlin.enums.a<e> o() {
        return f136806g;
    }

    @NotNull
    public final e l() {
        int i10 = a.f136809a[ordinal()];
        if (i10 == 1) {
            return SlideRight;
        }
        if (i10 == 2) {
            return SlideLeft;
        }
        if (i10 == 3) {
            return None;
        }
        throw new k0();
    }

    public final int n() {
        return this.f136807a;
    }

    public final int p() {
        return this.f136808b;
    }
}
