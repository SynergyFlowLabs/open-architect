package coil;

import android.content.Context;
import androidx.annotation.m1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "ImageLoaders")
public final class l {

    @kotlin.coroutines.jvm.internal.f(c = "coil.ImageLoaders$executeBlocking$1", f = "ImageLoaders.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super coil.request.j>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f87492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f87493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ coil.request.i f87494c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, coil.request.i iVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f87493b = jVar;
            this.f87494c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f87493b, this.f87494c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f87492a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            j jVar = this.f87493b;
            coil.request.i iVar = this.f87494c;
            this.f87492a = 1;
            Object objD = jVar.d(iVar, this);
            return objD == objL ? objL : objD;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super coil.request.j> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @oj.i(name = "create")
    @NotNull
    public static final j a(@NotNull Context context) {
        return new j.a(context).l();
    }

    @m1
    @NotNull
    public static final coil.request.j b(@NotNull j jVar, @NotNull coil.request.i iVar) {
        return (coil.request.j) kotlinx.coroutines.j.b(null, new a(jVar, iVar, null), 1, null);
    }
}
