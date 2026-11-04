package com.planner5d.library.activity.fragment.dialog.purchase;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.statistics.events.l2;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@ij.f
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f132821d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f132822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c2 f132823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y3.a f132824c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132825a;

        static {
            int[] iArr = new int[fd.k.values().length];
            try {
                iArr[fd.k.RENDERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fd.k.CATALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fd.k.TEXTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fd.k.DESIGN_GENERATOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fd.k.PLAN_RECOGNITIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f132825a = iArr;
        }
    }

    @ij.a
    public v(@NotNull Application application, @NotNull c2 networkStateUtility) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        this.f132822a = application;
        this.f132823b = networkStateUtility;
        this.f132824c = y3.a.google;
    }

    private final String f(fd.f fVar) {
        String strC;
        fd.i iVarK = fVar.k();
        return (iVarK == null || (strC = iVarK.c()) == null) ? fVar.a() : strC;
    }

    private final y3.e g(fd.k kVar) {
        int i10 = a.f132825a[kVar.ordinal()];
        if (i10 == 1) {
            return y3.e.snapshots;
        }
        if (i10 == 2) {
            return y3.e.catalog;
        }
        if (i10 == 3) {
            return y3.e.textures;
        }
        if (i10 == 4) {
            return y3.e.design_generator;
        }
        if (i10 == 5) {
            return y3.e.plan_recognitions;
        }
        throw new k0();
    }

    public final void a(@Nullable e0 e0Var) {
        y3.d dVar;
        l2 l2Var = l2.f217094b;
        if (e0Var != null && e0Var.h()) {
            dVar = y3.d.failed;
        } else if (e0Var == null || !e0Var.i()) {
            dVar = (e0Var != null ? e0Var.f132585d : null) != null ? y3.d.sku : y3.d.start;
        } else {
            dVar = y3.d.complete;
        }
        l2Var.C(dVar);
    }

    public final void b(@NotNull fd.k skuType, @NotNull fd.e layout, @Nullable fd.f fVar, boolean z10, @Nullable y3.c cVar) {
        Intrinsics.checkNotNullParameter(skuType, "skuType");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (Intrinsics.areEqual(fVar != null ? Double.valueOf(fVar.h()) : null, 0.0d)) {
            l2.f217094b.o0(this.f132824c, g(skuType), layout, f(fVar), z10, Float.valueOf((float) fVar.h()), fVar.g(), cVar);
        }
        l2.f217094b.P0(this.f132824c, g(skuType), layout, fVar != null ? f(fVar) : null, z10, fVar != null ? Float.valueOf((float) fVar.h()) : null, fVar != null ? fVar.g() : null, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    public final void c(@NotNull fd.k skuType, @Nullable fd.f fVar, @NotNull Throwable throwable) {
        y3.b bVar;
        y3.b bVar2;
        y3.b bVar3;
        String strF;
        Intrinsics.checkNotNullParameter(skuType, "skuType");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String error = ErrorMessageException.getError(this.f132822a, throwable);
        y3.b bVar4 = y3.b.other;
        if (!ErrorMessageException.isWithCode(throwable, com.planner5d.library.f.s.sx)) {
            if (ErrorMessageException.isWithCode(throwable, com.planner5d.library.f.s.Aa)) {
                bVar3 = y3.b.validation;
            } else {
                com.planner5d.library.model.payments.paymentmethod.googleplayinapp.b bVarB = com.planner5d.library.model.payments.paymentmethod.googleplayinapp.b.f222582b.b(error);
                if (bVarB == null) {
                    bVar = null;
                } else if (bVarB.b()) {
                    bVar = y3.b.already_owned;
                } else if (bVarB.c()) {
                    bVar = y3.b.user_canceled;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    bVar4 = bVar;
                } else if (!this.f132823b.d(this.f132822a) || ErrorMessageException.isWithCode(throwable, com.planner5d.library.f.s.I9)) {
                    bVar4 = y3.b.network;
                }
                bVar2 = bVar4;
            }
            l2 l2Var = l2.f217094b;
            y3.a aVar = this.f132824c;
            y3.e eVarG = g(skuType);
            if (fVar != null) {
                strF = f(fVar);
            } else {
                strF = null;
            }
            l2Var.t(aVar, eVarG, strF, bVar2, error);
        }
        bVar3 = y3.b.sign_in_required;
        bVar2 = bVar3;
        l2 l2Var2 = l2.f217094b;
        y3.a aVar2 = this.f132824c;
        y3.e eVarG2 = g(skuType);
        if (fVar != null) {
            strF = f(fVar);
        } else {
            strF = null;
        }
        l2Var2.t(aVar2, eVarG2, strF, bVar2, error);
    }

    public final void d(@NotNull fd.k skuType, @NotNull fd.e layout) {
        Intrinsics.checkNotNullParameter(skuType, "skuType");
        Intrinsics.checkNotNullParameter(layout, "layout");
        l2.f217094b.S0(g(skuType), layout);
    }

    @NotNull
    public final y3.a e() {
        return this.f132824c;
    }
}
