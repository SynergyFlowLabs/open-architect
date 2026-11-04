package com.planner5d.library.util.location;

import android.app.Application;
import android.location.Location;
import androidx.annotation.a1;
import com.google.android.gms.location.p;
import com.google.android.gms.tasks.Task;
import com.planner5d.library.services.utility.c0;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f235843a;

    @f(c = "com.planner5d.library.util.location.LocationManager", f = "LocationManager.kt", i = {}, l = {19}, m = "getCurrentLocation", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f235844a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f235846c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f235844a = obj;
            this.f235846c |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    @ij.a
    public b(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f235843a = application;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @Nullable
    public final Object a(@NotNull kotlin.coroutines.d<? super Location> dVar) throws Throwable {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f235846c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f235846c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objF = aVar.f235844a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f235846c;
        if (i11 == 0) {
            ResultKt.m(objF);
            c0 c0Var = c0.f225068a;
            Task<Location> taskD = p.b(this.f235843a).d(100, null);
            Intrinsics.checkNotNullExpressionValue(taskD, "getCurrentLocation(...)");
            aVar.f235846c = 1;
            objF = c0Var.f(taskD, aVar);
            if (objF == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objF);
        }
        Intrinsics.checkNotNullExpressionValue(objF, "await(...)");
        return objF;
    }
}
