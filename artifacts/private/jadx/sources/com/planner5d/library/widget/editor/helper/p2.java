package com.planner5d.library.widget.editor.helper;

import android.os.Bundle;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.item.ItemProject;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class p2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f256650m = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Project f256652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private ItemProject f256653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.editor.a f256654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f256655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Bundle f256656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f256657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private String f256658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f256659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f256660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f256661k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f256651a = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f256662l = new AtomicBoolean(false);

    public final void a() {
        this.f256652b = null;
        this.f256653c = null;
        this.f256654d = null;
        this.f256655e = false;
        this.f256656f = null;
        this.f256657g = false;
        this.f256658h = null;
        this.f256659i = 0;
        this.f256660j = false;
        this.f256661k = false;
        this.f256662l.set(false);
    }

    @Nullable
    public final Bundle b() {
        return this.f256656f;
    }

    @Nullable
    public final com.planner5d.library.widget.editor.a c() {
        return this.f256654d;
    }

    public final int d() {
        return this.f256659i;
    }

    public final boolean e() {
        return this.f256660j;
    }

    public final boolean f() {
        return this.f256657g;
    }

    @Nullable
    public final ItemProject g() {
        return this.f256653c;
    }

    @NotNull
    public final Object h() {
        return this.f256651a;
    }

    @Nullable
    public final Project i() {
        return this.f256652b;
    }

    @Nullable
    public final String j() {
        return this.f256658h;
    }

    public final boolean k() {
        return this.f256655e;
    }

    public final boolean l() {
        return this.f256661k;
    }

    public final boolean m() {
        return this.f256662l.get();
    }

    public final void n(@Nullable Bundle bundle) {
        this.f256656f = bundle;
    }

    public final void o() {
        this.f256662l.set(true);
    }

    public final void p(@Nullable Project project, @Nullable ItemProject itemProject) {
        this.f256652b = project;
        this.f256653c = itemProject;
    }

    public final void q(@Nullable com.planner5d.library.widget.editor.a aVar) {
        this.f256654d = aVar;
    }

    public final void r(boolean z10) {
        this.f256660j = z10;
    }

    public final void s(boolean z10) {
        this.f256657g = z10;
    }

    public final void t(@Nullable String str) {
        this.f256658h = str;
    }

    public final void u(boolean z10) {
        this.f256655e = z10;
    }

    public final void v(boolean z10) {
        this.f256661k = z10;
    }

    public final int w(boolean z10) {
        int iMax = Math.max(0, this.f256659i + (z10 ? 1 : -1));
        this.f256659i = iMax;
        return iMax;
    }
}
