package androidx.datastore.core;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.C0}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<j0<T>, Boolean, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f49800b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return k((j0) obj, bool.booleanValue(), (kotlin.coroutines.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49799a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            j0 j0Var = (j0) this.f49800b;
            this.f49799a = 1;
            Object objD = j0Var.d(this);
            return objD == objL ? objL : objD;
        }

        @Nullable
        public final Object k(@NotNull j0<T> j0Var, boolean z10, @Nullable kotlin.coroutines.d<? super T> dVar) {
            a aVar = new a(dVar);
            aVar.f49800b = j0Var;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.StorageConnectionKt$writeData$2", f = "StorageConnection.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements Function2<w0<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f49802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f49803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(T t10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f49803c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f49803c, dVar);
            bVar.f49802b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49801a;
            if (i10 == 0) {
                ResultKt.m(obj);
                w0 w0Var = (w0) this.f49802b;
                T t10 = this.f49803c;
                this.f49801a = 1;
                if (w0Var.a(t10, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull w0<T> w0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(w0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> Object a(@NotNull r0<T> r0Var, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return r0Var.e(new a(null), dVar);
    }

    @Nullable
    public static final <T> Object b(@NotNull r0<T> r0Var, T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objB = r0Var.b(new b(t10, null), dVar);
        return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
    }
}
