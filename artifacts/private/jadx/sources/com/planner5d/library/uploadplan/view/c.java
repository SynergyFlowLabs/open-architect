package com.planner5d.library.uploadplan.view;

import androidx.annotation.f1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f230897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f230898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f230899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f230900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f230901e;

    public enum a {
        FromScratch,
        UploadPlan,
        SmartWizard;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f230906e = kotlin.enums.c.c(k());

        static {
            int i10 = 7 & 1;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f230906e;
        }
    }

    public c(@f1 int i10, @f1 int i11, @androidx.annotation.v int i12, boolean z10, @NotNull a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f230897a = i10;
        this.f230898b = i11;
        this.f230899c = i12;
        this.f230900d = z10;
        this.f230901e = type;
    }

    public final int a() {
        return this.f230899c;
    }

    public final boolean b() {
        return this.f230900d;
    }

    public final int c() {
        return this.f230898b;
    }

    public final int d() {
        return this.f230897a;
    }

    @NotNull
    public final a e() {
        return this.f230901e;
    }
}
