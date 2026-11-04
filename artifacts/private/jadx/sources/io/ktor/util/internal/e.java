package io.ktor.util.internal;

import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f296648a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f296649b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f296650c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f296651d = new i("CONDITION_FALSE");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Object f296652e = new i("ALREADY_REMOVED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Object f296653f = new i("LIST_EMPTY");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Object f296654g = new i("REMOVE_PREPARED");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Object f296655h = new i("NO_DECISION");

    @NotNull
    public static final Object c() {
        return f296652e;
    }

    @a1
    public static /* synthetic */ void d() {
    }

    @NotNull
    public static final Object e() {
        return f296651d;
    }

    @a1
    public static /* synthetic */ void f() {
    }

    @a1
    public static /* synthetic */ void g() {
    }

    @NotNull
    public static final Object h() {
        return f296653f;
    }

    @a1
    public static /* synthetic */ void i() {
    }

    @a1
    public static /* synthetic */ void j() {
    }

    @a1
    public static /* synthetic */ void k() {
    }

    @a1
    @NotNull
    public static final f l(@NotNull Object obj) {
        f fVar;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        h hVar = obj instanceof h ? (h) obj : null;
        return (hVar == null || (fVar = hVar.f296673a) == null) ? (f) obj : fVar;
    }
}
