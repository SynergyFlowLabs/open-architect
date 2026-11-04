package com.superwall.sdk.paywall.presentation.rule_logic.cel.models;

import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELAtom;
import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELExpression;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nmapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 mapping.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/models/MappingKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,63:1\n1557#2:64\n1628#2,3:65\n1557#2:68\n1628#2,3:69\n1557#2:72\n1628#2,3:73\n126#3:76\n153#3,3:77\n*S KotlinDebug\n*F\n+ 1 mapping.kt\ncom/superwall/sdk/paywall/presentation/rule_logic/cel/models/MappingKt\n*L\n20#1:64\n20#1:65,3\n24#1:68\n24#1:69,3\n50#1:72\n50#1:73,3\n54#1:76\n54#1:77,3\n*E\n"})
public final class MappingKt {
    @NotNull
    public static final CELExpression toCELExpression(@NotNull PassableValue passableValue) {
        Intrinsics.checkNotNullParameter(passableValue, "<this>");
        if (passableValue instanceof PassableValue.IntValue) {
            return new CELExpression.Atom(new CELAtom.Int(((PassableValue.IntValue) passableValue).getValue()));
        }
        if (passableValue instanceof PassableValue.UIntValue) {
            return new CELExpression.Atom(new CELAtom.UInt(((PassableValue.UIntValue) passableValue).m74getValuesVKNKU(), null));
        }
        if (passableValue instanceof PassableValue.FloatValue) {
            return new CELExpression.Atom(new CELAtom.Float(((PassableValue.FloatValue) passableValue).getValue()));
        }
        if (passableValue instanceof PassableValue.StringValue) {
            return new CELExpression.Atom(new CELAtom.String(((PassableValue.StringValue) passableValue).getValue()));
        }
        if (passableValue instanceof PassableValue.BytesValue) {
            return new CELExpression.Atom(new CELAtom.Bytes(((PassableValue.BytesValue) passableValue).getValue()));
        }
        if (passableValue instanceof PassableValue.BoolValue) {
            return new CELExpression.Atom(new CELAtom.Bool(((PassableValue.BoolValue) passableValue).getValue()));
        }
        if (passableValue instanceof PassableValue.TimestampValue) {
            return new CELExpression.Atom(new CELAtom.Int(((PassableValue.TimestampValue) passableValue).getValue()));
        }
        if (Intrinsics.areEqual(passableValue, PassableValue.NullValue.INSTANCE)) {
            return new CELExpression.Atom(CELAtom.Null.INSTANCE);
        }
        if (passableValue instanceof PassableValue.ListValue) {
            List<PassableValue> value = ((PassableValue.ListValue) passableValue).getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(toCELExpression((PassableValue) it.next()));
            }
            return new CELExpression.List(arrayList);
        }
        if (!(passableValue instanceof PassableValue.MapValue)) {
            if (!(passableValue instanceof PassableValue.FunctionValue)) {
                throw new k0();
            }
            throw new l0("An operation is not implemented: Not yet implemented");
        }
        Map<String, PassableValue> value2 = ((PassableValue.MapValue) passableValue).getValue();
        ArrayList arrayList2 = new ArrayList(value2.size());
        for (Map.Entry<String, PassableValue> entry : value2.entrySet()) {
            arrayList2.add(TuplesKt.to(new CELExpression.Atom(new CELAtom.String(entry.getKey())), toCELExpression(entry.getValue())));
        }
        return new CELExpression.Map(CollectionsKt.toList(arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    @NotNull
    public static final PassableValue toPassableValue(@NotNull CELExpression cELExpression) {
        String string;
        CELAtom value;
        Intrinsics.checkNotNullParameter(cELExpression, "<this>");
        if (cELExpression instanceof CELExpression.Atom) {
            CELAtom value2 = ((CELExpression.Atom) cELExpression).getValue();
            if (value2 instanceof CELAtom.Int) {
                return new PassableValue.IntValue((int) ((CELAtom.Int) value2).getValue());
            }
            if (value2 instanceof CELAtom.UInt) {
                return new PassableValue.UIntValue(((CELAtom.UInt) value2).m79getValuesVKNKU(), null);
            }
            if (value2 instanceof CELAtom.Float) {
                return new PassableValue.FloatValue(((CELAtom.Float) value2).getValue());
            }
            if (value2 instanceof CELAtom.String) {
                return new PassableValue.StringValue(((CELAtom.String) value2).getValue());
            }
            if (value2 instanceof CELAtom.Bytes) {
                return new PassableValue.BytesValue(((CELAtom.Bytes) value2).getValue());
            }
            if (value2 instanceof CELAtom.Bool) {
                return new PassableValue.BoolValue(((CELAtom.Bool) value2).getValue());
            }
            if (Intrinsics.areEqual(value2, CELAtom.Null.INSTANCE)) {
                return PassableValue.NullValue.INSTANCE;
            }
            throw new k0();
        }
        if (cELExpression instanceof CELExpression.List) {
            List<CELExpression> elements = ((CELExpression.List) cELExpression).getElements();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(elements, 10));
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                arrayList.add(toPassableValue((CELExpression) it.next()));
            }
            return new PassableValue.ListValue(arrayList);
        }
        if (!(cELExpression instanceof CELExpression.Map)) {
            throw new l0("An operation is not implemented: Not yet implemented");
        }
        List<Pair<CELExpression, CELExpression>> entries = ((CELExpression.Map) cELExpression).getEntries();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        Iterator<T> it2 = entries.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            CELExpression cELExpression2 = (CELExpression) pair.component1();
            CELExpression cELExpression3 = (CELExpression) pair.component2();
            CELExpression.Atom atom = cELExpression2 instanceof CELExpression.Atom ? (CELExpression.Atom) cELExpression2 : null;
            if (atom == null || (value = atom.getValue()) == null) {
                string = cELExpression2.toString();
            } else {
                string = value instanceof CELAtom.String ? ((CELAtom.String) value).getValue() : value.toString();
                if (string == null) {
                    string = cELExpression2.toString();
                }
            }
            arrayList2.add(TuplesKt.to(string, toPassableValue(cELExpression3)));
        }
        return new PassableValue.MapValue(MapsKt.toMap(arrayList2));
    }
}
