package androidx.compose.ui.autofill;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,148:1\n151#2,2:149\n35#2,5:151\n153#2:156\n37#3,2:157\n26#4:159\n26#4:160\n26#4:161\n26#4:162\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n101#1:149,2\n101#1:151,5\n101#1:156\n101#1:157,2\n114#1:159\n115#1:160\n116#1:161\n117#1:162\n*E\n"})
public final class e {
    @w0(26)
    public static final void a(@NotNull a aVar, @NotNull SparseArray<AutofillValue> sparseArray) {
        if (aVar.d().a().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            i iVar = i.f36978a;
            if (iVar.g(autofillValue)) {
                aVar.d().b(iKeyAt, iVar.G(autofillValue).toString());
            } else {
                if (iVar.e(autofillValue)) {
                    throw new l0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (iVar.f(autofillValue)) {
                    throw new l0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (iVar.h(autofillValue)) {
                    throw new l0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @w0(26)
    public static final void b(@NotNull a aVar, @NotNull ViewStructure viewStructure) {
        if (aVar.d().a().isEmpty()) {
            return;
        }
        int iA = i.f36978a.a(viewStructure, aVar.d().a().size());
        for (Map.Entry<Integer, o> entry : aVar.d().a().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            o value = entry.getValue();
            i iVar = i.f36978a;
            ViewStructure viewStructureJ = iVar.j(viewStructure, iA);
            iVar.l(viewStructureJ, aVar.e(), iIntValue);
            iVar.z(viewStructureJ, iIntValue, aVar.f().getContext().getPackageName(), null, null);
            iVar.m(viewStructureJ, t.b(s.f37034a.d()));
            List<r> listD = value.d();
            ArrayList arrayList = new ArrayList(listD.size());
            int size = listD.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(d.b(listD.get(i10)));
            }
            iVar.k(viewStructureJ, (String[]) arrayList.toArray(new String[0]));
            n0.j jVarE = value.e();
            if (jVarE != null) {
                int iRound = Math.round(jVarE.t());
                int iRound2 = Math.round(jVarE.B());
                int iRound3 = Math.round(jVarE.x());
                i.f36978a.v(viewStructureJ, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(jVarE.j()) - iRound2);
            }
            iA++;
        }
    }
}
