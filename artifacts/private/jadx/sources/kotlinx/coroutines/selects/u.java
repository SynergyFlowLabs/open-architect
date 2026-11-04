package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.a1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@a1
@SourceDebugExtension({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1863#2,2:66\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n60#1:66,2\n*E\n"})
public class u<R> extends m<R> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<m<R>.a> f315570g;

    public u(@NotNull CoroutineContext coroutineContext) {
        super(coroutineContext);
        this.f315570g = new ArrayList();
    }

    @a1
    static /* synthetic */ <R> Object P(u<R> uVar, kotlin.coroutines.d<? super R> dVar) {
        uVar.Q();
        return super.w(dVar);
    }

    private final void Q() {
        try {
            Collections.shuffle(this.f315570g);
            Iterator<T> it = this.f315570g.iterator();
            while (it.hasNext()) {
                m.I(this, (m.a) it.next(), false, 1, null);
            }
            this.f315570g.clear();
        } catch (Throwable th2) {
            this.f315570g.clear();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.selects.m, kotlinx.coroutines.selects.d
    public void a(@NotNull f fVar, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1) {
        this.f315570g.add(new m.a(fVar.d(), fVar.c(), fVar.b(), p.l(), function1, fVar.a()));
    }

    @Override // kotlinx.coroutines.selects.m, kotlinx.coroutines.selects.d
    public <P, Q> void c(@NotNull j<? super P, ? extends Q> jVar, P p10, @NotNull Function2<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        this.f315570g.add(new m.a(jVar.d(), jVar.c(), jVar.b(), p10, function2, jVar.a()));
    }

    @Override // kotlinx.coroutines.selects.m, kotlinx.coroutines.selects.d
    public <Q> void j(@NotNull h<? extends Q> hVar, @NotNull Function2<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        this.f315570g.add(new m.a(hVar.d(), hVar.c(), hVar.b(), null, function2, hVar.a()));
    }

    @Override // kotlinx.coroutines.selects.m
    @a1
    @Nullable
    public Object w(@NotNull kotlin.coroutines.d<? super R> dVar) {
        return P(this, dVar);
    }
}
