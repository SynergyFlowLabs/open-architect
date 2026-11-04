package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4061:1\n1#2:4062\n*E\n"})
final class g7 implements Iterator<androidx.compose.runtime.tooling.m>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w5 f35802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l2 f35804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h7 f35805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35807f;

    public g7(@NotNull w5 w5Var, int i10, @NotNull l2 l2Var, @NotNull h7 h7Var) {
        this.f35802a = w5Var;
        this.f35803b = i10;
        this.f35804c = l2Var;
        this.f35805d = h7Var;
        this.f35806e = w5Var.K();
    }

    @NotNull
    public final l2 b() {
        return this.f35804c;
    }

    public final int c() {
        return this.f35803b;
    }

    @NotNull
    public final h7 d() {
        return this.f35805d;
    }

    @NotNull
    public final w5 e() {
        return this.f35802a;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.tooling.m next() {
        Object obj;
        ArrayList<Object> arrayListH = this.f35804c.h();
        if (arrayListH != null) {
            int i10 = this.f35807f;
            this.f35807f = i10 + 1;
            obj = arrayListH.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof g) {
            return new x5(this.f35802a, ((g) obj).a(), this.f35806e);
        }
        if (obj instanceof l2) {
            return new i7(this.f35802a, this.f35803b, (l2) obj, new k5(this.f35805d, this.f35807f - 1));
        }
        m0.z("Unexpected group information structure");
        throw new kotlin.a0();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> arrayListH = this.f35804c.h();
        return arrayListH != null && this.f35807f < arrayListH.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
