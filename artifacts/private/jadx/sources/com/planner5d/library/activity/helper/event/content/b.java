package com.planner5d.library.activity.helper.event.content;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.j;
import com.planner5d.library.activity.helper.f0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContentRequestLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentRequestLauncher.kt\ncom/planner5d/library/activity/helper/event/content/ContentRequestLauncher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class b implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static a f136791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static f0 f136792c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f136790a = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f136793d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136794e = 8;

    private b() {
    }

    private final void b() {
        Pair pair;
        f0 f0Var;
        synchronized (f136793d) {
            try {
                if (f136791b == null || (f0Var = f136792c) == null) {
                    pair = null;
                } else {
                    Intrinsics.checkNotNull(f0Var);
                    a aVar = f136791b;
                    Intrinsics.checkNotNull(aVar);
                    pair = new Pair(f0Var, aVar);
                    f136791b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pair != null) {
            ((f0) pair.getFirst()).t((a) pair.getSecond(), null);
        }
    }

    @Override // com.planner5d.library.activity.fragment.j
    public void a(@NotNull a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        synchronized (f136793d) {
            f136791b = request;
            Unit unit = Unit.f312394a;
        }
        b();
    }

    public final void c() {
        synchronized (f136793d) {
            try {
                f136792c = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(@NotNull f0 helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        synchronized (f136793d) {
            f136792c = helper;
            f136790a.b();
            Unit unit = Unit.f312394a;
        }
    }
}
