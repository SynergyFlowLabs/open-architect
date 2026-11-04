package com.planner5d.library.activity.fragment.gallery;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import com.planner5d.library.activity.fragment.CheckableBottomSheetMenuFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.planner5d.library.model.manager.q0 f133746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f133747b;

    @ij.a
    public c(com.planner5d.library.model.manager.q0 q0Var) {
        this.f133746a = q0Var;
    }

    public static /* synthetic */ Unit a(a aVar, ue.b bVar) {
        aVar.applyFiltering(a.EnumC1468a.SORTING, ((Integer) ((Pair) bVar).first).toString());
        return Unit.f312394a;
    }

    private ue.b[] d(String[] strArr) {
        ue.b[] bVarArr = new ue.b[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            bVarArr[i10] = new ue.b(Integer.valueOf(i10), strArr[i10]);
        }
        return bVarArr;
    }

    public void b(@NonNull a aVar) {
        this.f133747b = aVar;
    }

    public void c(@NonNull androidx.fragment.app.s sVar) {
        final a aVar = this.f133747b;
        if (aVar == null) {
            return;
        }
        ue.b[] bVarArrD = d(this.f133746a.z(sVar));
        FragmentManager supportFragmentManager = sVar.getSupportFragmentManager();
        new CheckableBottomSheetMenuFragment(supportFragmentManager, sVar.getString(com.planner5d.library.f.s.DB), bVarArrD, this.f133746a.y(aVar.getListFilter().f197681b), new Function1() { // from class: com.planner5d.library.activity.fragment.gallery.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.a(aVar, (ue.b) obj);
            }
        }).showMenu(supportFragmentManager, null);
    }
}
