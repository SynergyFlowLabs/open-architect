package androidx.collection;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class l3 {

    public static final class a extends IntIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j3<T> f12345b;

        a(j3<T> j3Var) {
            this.f12345b = j3Var;
        }

        public final int b() {
            return this.f12344a;
        }

        public final void c(int i10) {
            this.f12344a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12344a < this.f12345b.size();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.collections.IntIterator
        public int nextInt() {
            j3<T> j3Var = this.f12345b;
            int i10 = this.f12344a;
            this.f12344a = i10 + 1;
            return j3Var.n(i10);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements Iterator<T>, qj.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j3<T> f12347b;

        b(j3<T> j3Var) {
            this.f12347b = j3Var;
        }

        public final int b() {
            return this.f12346a;
        }

        public final void c(int i10) {
            this.f12346a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12346a < this.f12347b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            j3<T> j3Var = this.f12347b;
            int i10 = this.f12346a;
            this.f12346a = i10 + 1;
            return j3Var.z(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@NotNull j3<T> j3Var, int i10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return j3Var.d(i10);
    }

    public static final <T> void b(@NotNull j3<T> j3Var, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = j3Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Integer.valueOf(j3Var.n(i10)), j3Var.z(i10));
        }
    }

    public static final <T> T c(@NotNull j3<T> j3Var, int i10, T t10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return j3Var.h(i10, t10);
    }

    public static final <T> T d(@NotNull j3<T> j3Var, int i10, @NotNull Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T tG = j3Var.g(i10);
        return tG == null ? defaultValue.invoke() : tG;
    }

    public static final <T> int e(@NotNull j3<T> j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return j3Var.size();
    }

    public static final <T> boolean f(@NotNull j3<T> j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return !j3Var.l();
    }

    @NotNull
    public static final <T> IntIterator g(@NotNull j3<T> j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return new a(j3Var);
    }

    @NotNull
    public static final <T> j3<T> h(@NotNull j3<T> j3Var, @NotNull j3<T> other) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        j3<T> j3Var2 = new j3<>(j3Var.size() + other.size());
        j3Var2.p(j3Var);
        j3Var2.p(other);
        return j3Var2;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean i(j3 j3Var, int i10, Object obj) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return j3Var.s(i10, obj);
    }

    public static final <T> void j(@NotNull j3<T> j3Var, int i10, T t10) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        j3Var.o(i10, t10);
    }

    @NotNull
    public static final <T> Iterator<T> k(@NotNull j3<T> j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        return new b(j3Var);
    }
}
