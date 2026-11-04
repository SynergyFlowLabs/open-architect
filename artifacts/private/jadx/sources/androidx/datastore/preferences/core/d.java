package androidx.datastore.preferences.core;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements androidx.datastore.core.l<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.datastore.core.l<f> f49864a;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160703k1}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<f, kotlin.coroutines.d<? super f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f49866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<f, kotlin.coroutines.d<? super f>, Object> f49867c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super f, ? super kotlin.coroutines.d<? super f>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f49867c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f49867c, dVar);
            aVar.f49866b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49865a;
            if (i10 == 0) {
                ResultKt.m(obj);
                f fVar = (f) this.f49866b;
                Function2<f, kotlin.coroutines.d<? super f>, Object> function2 = this.f49867c;
                this.f49865a = 1;
                obj = function2.invoke(fVar, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            f fVar2 = (f) obj;
            Intrinsics.checkNotNull(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).h();
            return fVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull f fVar, @Nullable kotlin.coroutines.d<? super f> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public d(@NotNull androidx.datastore.core.l<f> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f49864a = delegate;
    }

    @Override // androidx.datastore.core.l
    @Nullable
    public Object a(@NotNull Function2<? super f, ? super kotlin.coroutines.d<? super f>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super f> dVar) {
        return this.f49864a.a(new a(function2, null), dVar);
    }

    @Override // androidx.datastore.core.l
    @NotNull
    public kotlinx.coroutines.flow.i<f> getData() {
        return this.f49864a.getData();
    }
}
