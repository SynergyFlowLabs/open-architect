package androidx.compose.runtime.saveable;

import androidx.compose.runtime.m5;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,391:1\n1#2:392\n*E\n"})
final class l<T> implements g0, m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private c0<T, Object> f36403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private v f36404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f36405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f36406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Object[] f36407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private v.a f36408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function0<Object> f36409g = new Function0() { // from class: androidx.compose.runtime.saveable.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.f(this.f36402a);
        }
    };

    public l(@NotNull c0<T, Object> c0Var, @Nullable v vVar, @NotNull String str, T t10, @NotNull Object[] objArr) {
        this.f36403a = c0Var;
        this.f36404b = vVar;
        this.f36405c = str;
        this.f36406d = t10;
        this.f36407e = objArr;
    }

    private final void d() {
        v vVar = this.f36404b;
        if (this.f36408f == null) {
            if (vVar != null) {
                i.m(vVar, this.f36409g.invoke());
                this.f36408f = vVar.b(this.f36405c, this.f36409g);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f36408f + ") is not null").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(l lVar) {
        c0<T, Object> c0Var = lVar.f36403a;
        T t10 = lVar.f36406d;
        if (t10 != null) {
            return c0Var.a(lVar, t10);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }

    @Override // androidx.compose.runtime.saveable.g0
    public boolean a(@NotNull Object obj) {
        v vVar = this.f36404b;
        return vVar == null || vVar.a(obj);
    }

    @Nullable
    public final T c(@NotNull Object[] objArr) {
        if (Arrays.equals(objArr, this.f36407e)) {
            return this.f36406d;
        }
        return null;
    }

    public final void e(@NotNull c0<T, Object> c0Var, @Nullable v vVar, @NotNull String str, T t10, @NotNull Object[] objArr) {
        boolean z10;
        boolean z11 = true;
        if (this.f36404b != vVar) {
            this.f36404b = vVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (Intrinsics.areEqual(this.f36405c, str)) {
            z11 = z10;
        } else {
            this.f36405c = str;
        }
        this.f36403a = c0Var;
        this.f36406d = t10;
        this.f36407e = objArr;
        v.a aVar = this.f36408f;
        if (aVar == null || !z11) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f36408f = null;
        d();
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
        d();
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
        v.a aVar = this.f36408f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        v.a aVar = this.f36408f;
        if (aVar != null) {
            aVar.a();
        }
    }
}
