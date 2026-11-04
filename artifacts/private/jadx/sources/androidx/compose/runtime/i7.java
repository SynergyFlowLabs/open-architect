package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class i7 implements androidx.compose.runtime.tooling.m, Iterable<androidx.compose.runtime.tooling.m>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w5 f35884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l2 f35886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h7 f35887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f35888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Iterable<androidx.compose.runtime.tooling.m> f35889f = this;

    public i7(@NotNull w5 w5Var, int i10, @NotNull l2 l2Var, @NotNull h7 h7Var) {
        this.f35884a = w5Var;
        this.f35885b = i10;
        this.f35886c = l2Var;
        this.f35887d = h7Var;
        this.f35888e = Integer.valueOf(l2Var.i());
    }

    @Override // androidx.compose.runtime.tooling.m
    @Nullable
    public String U1() {
        return this.f35886c.j();
    }

    @Override // androidx.compose.runtime.tooling.m
    @NotNull
    public Object X1() {
        return this.f35887d.a(this.f35884a);
    }

    @Override // androidx.compose.runtime.tooling.m
    @NotNull
    public Iterable<Object> getData() {
        return new f7(this.f35884a, this.f35885b, this.f35886c);
    }

    @Override // androidx.compose.runtime.tooling.m
    @NotNull
    public Object getKey() {
        return this.f35888e;
    }

    @Override // androidx.compose.runtime.tooling.f
    @NotNull
    public Iterable<androidx.compose.runtime.tooling.m> i() {
        return this.f35889f;
    }

    @Override // androidx.compose.runtime.tooling.f
    public boolean isEmpty() {
        ArrayList<Object> arrayListH = this.f35886c.h();
        boolean z10 = false;
        if (arrayListH != null && !arrayListH.isEmpty()) {
            z10 = true;
        }
        return !z10;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<androidx.compose.runtime.tooling.m> iterator() {
        return new g7(this.f35884a, this.f35885b, this.f35886c, this.f35887d);
    }

    @NotNull
    public final h7 k() {
        return this.f35887d;
    }

    public final int l() {
        return this.f35885b;
    }

    @NotNull
    public final l2 m() {
        return this.f35886c;
    }

    @NotNull
    public final w5 n() {
        return this.f35884a;
    }

    @Override // androidx.compose.runtime.tooling.m
    @Nullable
    public Object w() {
        return null;
    }
}
