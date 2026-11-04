package androidx.datastore.preferences.core;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/PreferencesKt$edit$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,361:1\n1#2:362\n*E\n"})
    static final class a extends o implements Function2<f, kotlin.coroutines.d<? super f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f49877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f49878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<c, kotlin.coroutines.d<? super Unit>, Object> f49879c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f49879c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f49879c, dVar);
            aVar.f49878b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f49877a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f49878b;
                ResultKt.m(obj);
                return cVar;
            }
            ResultKt.m(obj);
            c cVarD = ((f) this.f49878b).d();
            Function2<c, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f49879c;
            this.f49878b = cVarD;
            this.f49877a = 1;
            return function2.invoke(cVarD, this) == objL ? objL : cVarD;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull f fVar, @Nullable kotlin.coroutines.d<? super f> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final Object a(@NotNull androidx.datastore.core.l<f> lVar, @NotNull Function2<? super c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super f> dVar) {
        return lVar.a(new a(function2, null), dVar);
    }
}
