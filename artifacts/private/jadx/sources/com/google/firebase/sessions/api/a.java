package com.google.firebase.sessions.api;

import androidx.annotation.l1;
import com.google.firebase.sessions.a1;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f124851a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a1 f124852b;

    private a() {
    }

    @l1
    public static /* synthetic */ void b() {
    }

    @n
    public static final void c() {
        try {
            if (f124852b == null) {
                f124851a.d(a1.f124849a.a());
            }
            a aVar = f124851a;
            if (aVar.a().b()) {
                aVar.a().c();
            }
        } catch (Exception unused) {
        }
    }

    @NotNull
    public final a1 a() {
        a1 a1Var = f124852b;
        if (a1Var != null) {
            return a1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sharedSessionRepository");
        return null;
    }

    public final void d(@NotNull a1 a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "<set-?>");
        f124852b = a1Var;
    }
}
