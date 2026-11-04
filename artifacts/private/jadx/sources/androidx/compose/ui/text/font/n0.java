package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,444:1\n434#2:445\n435#2,7:447\n434#2:455\n435#2,7:457\n35#3:446\n35#3:456\n1#4:454\n1#4:464\n1#4:465\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n196#1:445\n196#1:447,7\n213#1:455\n213#1:457,7\n196#1:446\n213#1:456\n196#1:454\n213#1:465\n*E\n"})
public final class n0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair<List<x>, Object> b(List<? extends x> list, r1 r1Var, o oVar, d1 d1Var, Function1<? super r1, ? extends Object> function1) {
        Object objInvoke;
        Object objInvoke2;
        Object objM785constructorimpl;
        Object objI;
        int size = list.size();
        List listMutableListOf = null;
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = list.get(i10);
            int iB = xVar.b();
            o0.a aVar = o0.f41676b;
            if (o0.g(iB, aVar.b())) {
                synchronized (oVar.f41666d) {
                    try {
                        o.b bVar = new o.b(xVar, d1Var.getCacheKey());
                        o.a aVar2 = (o.a) oVar.f41664b.f(bVar);
                        if (aVar2 == null) {
                            aVar2 = (o.a) oVar.f41665c.p(bVar);
                        }
                        if (aVar2 != null) {
                            objInvoke2 = aVar2.i();
                        } else {
                            Unit unit = Unit.f312394a;
                            try {
                                objInvoke = d1Var.b(xVar);
                            } catch (Exception unused) {
                                objInvoke = function1.invoke(r1Var);
                            }
                            Object obj = objInvoke;
                            o.f(oVar, xVar, d1Var, obj, false, 8, null);
                            objInvoke2 = obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (objInvoke2 == null) {
                    objInvoke2 = function1.invoke(r1Var);
                }
                return TuplesKt.to(listMutableListOf, t0.a(r1Var.j(), objInvoke2, xVar, r1Var.k(), r1Var.i()));
            }
            if (o0.g(iB, aVar.c())) {
                synchronized (oVar.f41666d) {
                    try {
                        o.b bVar2 = new o.b(xVar, d1Var.getCacheKey());
                        o.a aVar3 = (o.a) oVar.f41664b.f(bVar2);
                        if (aVar3 == null) {
                            aVar3 = (o.a) oVar.f41665c.p(bVar2);
                        }
                        if (aVar3 != null) {
                            objI = aVar3.i();
                        } else {
                            Unit unit2 = Unit.f312394a;
                            try {
                                Result.a aVar4 = Result.Companion;
                                objM785constructorimpl = Result.m785constructorimpl(d1Var.b(xVar));
                            } catch (Throwable th3) {
                                Result.a aVar5 = Result.Companion;
                                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th3));
                            }
                            Object obj2 = Result.m786isFailureimpl(objM785constructorimpl) ? null : objM785constructorimpl;
                            o.f(oVar, xVar, d1Var, obj2, false, 8, null);
                            objI = obj2;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (objI != null) {
                    return TuplesKt.to(listMutableListOf, t0.a(r1Var.j(), objI, xVar, r1Var.k(), r1Var.i()));
                }
            } else {
                if (!o0.g(iB, aVar.a())) {
                    throw new IllegalStateException("Unknown font type " + xVar);
                }
                o.a aVarD = oVar.d(xVar, d1Var);
                if (aVarD != null) {
                    if (!o.a.g(aVarD.i()) && aVarD.i() != null) {
                        return TuplesKt.to(listMutableListOf, t0.a(r1Var.j(), aVarD.i(), xVar, r1Var.k(), r1Var.i()));
                    }
                } else if (listMutableListOf == null) {
                    listMutableListOf = CollectionsKt.mutableListOf(xVar);
                } else {
                    listMutableListOf.add(xVar);
                }
            }
        }
        return TuplesKt.to(listMutableListOf, function1.invoke(r1Var));
    }
}
