package klipper;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final p f312378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final i f312379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private x f312380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<k> f312381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f312382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList<x> f312383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f312384g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        int i10 = 4 << 3;
    }

    public final void a(@NotNull x child) {
        Intrinsics.checkNotNullParameter(child, "child");
        int size = this.f312383f.size();
        this.f312383f.add(child);
        child.f312380c = this;
        child.f312382e = size;
    }

    public final int b() {
        return this.f312383f.size();
    }

    @NotNull
    public final ArrayList<x> c() {
        return this.f312383f;
    }

    @NotNull
    public final List<k> d() {
        return this.f312381d;
    }

    @Nullable
    public final i e() {
        return this.f312379b;
    }

    @Nullable
    public final p f() {
        return this.f312378a;
    }

    @Nullable
    public final x g() {
        return !this.f312383f.isEmpty() ? this.f312383f.get(0) : h();
    }

    @Nullable
    public final x h() {
        x xVar = this.f312380c;
        if (xVar == null) {
            return null;
        }
        return this.f312382e == xVar.f312383f.size() + (-1) ? xVar.h() : xVar.f312383f.get(this.f312382e + 1);
    }

    @Nullable
    public final x i() {
        return this.f312380c;
    }

    public final boolean j() {
        boolean z10 = true;
        for (x xVar = this.f312380c; xVar != null; xVar = xVar.f312380c) {
            z10 = !z10;
        }
        return z10;
    }

    public final boolean k() {
        return this.f312384g;
    }

    public final void l(boolean z10) {
        this.f312384g = z10;
    }

    public final void m(@Nullable x xVar) {
        this.f312380c = xVar;
    }

    public x(@Nullable p pVar, @Nullable i iVar) {
        this.f312378a = pVar;
        this.f312379b = iVar;
        int i10 = 6 | 0;
        this.f312381d = q.c(new k[0]);
        this.f312383f = new ArrayList<>();
    }

    public /* synthetic */ x(p pVar, i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : pVar, (i10 & 2) != 0 ? null : iVar);
    }
}
