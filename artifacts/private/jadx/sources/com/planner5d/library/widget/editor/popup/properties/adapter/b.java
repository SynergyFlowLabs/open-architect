package com.planner5d.library.widget.editor.popup.properties.adapter;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class b<S> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f257930f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final S f257931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f257932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f257933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f257934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f257935e;

    public b(@Nullable S s10, @Nullable String str, boolean z10, boolean z11, boolean z12) {
        this.f257931a = s10;
        this.f257932b = str;
        this.f257933c = z10;
        this.f257934d = z11;
        this.f257935e = z12;
    }

    @Nullable
    public final S a() {
        return this.f257931a;
    }

    public final boolean b() {
        return this.f257933c;
    }

    @Nullable
    public final String c() {
        return this.f257932b;
    }

    public final boolean d() {
        return this.f257934d;
    }

    public final boolean e() {
        return this.f257935e;
    }

    public /* synthetic */ b(Object obj, String str, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? true : z12);
    }
}
