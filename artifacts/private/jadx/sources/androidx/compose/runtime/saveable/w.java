package androidx.compose.runtime.saveable;

import androidx.collection.b3;
import androidx.collection.k2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,186:1\n1#2:187\n1#2:189\n683#3:188\n357#4,4:190\n329#4,6:194\n339#4,3:201\n342#4,9:205\n361#4:214\n357#4,4:215\n329#4,6:219\n339#4,3:226\n342#4,9:230\n361#4:239\n1399#5:200\n1270#5:204\n1399#5:225\n1270#5:229\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n136#1:189\n136#1:188\n158#1:190,4\n158#1:194,6\n158#1:201,3\n158#1:205,9\n158#1:214\n160#1:215,4\n160#1:219,6\n160#1:226,3\n160#1:230,9\n160#1:239\n158#1:200\n158#1:204\n160#1:225\n160#1:229\n*E\n"})
final class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Object, Boolean> f36427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final k2<String, List<Object>> f36428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private k2<String, List<Function0<Object>>> f36429c;

    public static final class a implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2<String, List<Function0<Object>>> f36430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Object> f36432c;

        a(k2<String, List<Function0<Object>>> k2Var, String str, Function0<? extends Object> function0) {
            this.f36430a = k2Var;
            this.f36431b = str;
            this.f36432c = function0;
        }

        @Override // androidx.compose.runtime.saveable.v.a
        public void a() {
            List<Function0<Object>> listL0 = this.f36430a.l0(this.f36431b);
            if (listL0 != null) {
                listL0.remove(this.f36432c);
            }
            List<Function0<Object>> list = listL0;
            if (list != null && !list.isEmpty()) {
                this.f36430a.q0(this.f36431b, listL0);
            }
        }
    }

    public w(@Nullable Map<String, ? extends List<? extends Object>> map, @NotNull Function1<Object, Boolean> function1) {
        this.f36427a = function1;
        this.f36428b = (map == null || map.isEmpty()) ? null : y.h(map);
    }

    @Override // androidx.compose.runtime.saveable.v
    public boolean a(@NotNull Object obj) {
        return this.f36427a.invoke(obj).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.v
    @NotNull
    public v.a b(@NotNull String str, @NotNull Function0<? extends Object> function0) {
        if (y.f(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        k2<String, List<Function0<Object>>> k2VarU = this.f36429c;
        if (k2VarU == null) {
            k2VarU = b3.u();
            this.f36429c = k2VarU;
        }
        List<Function0<Object>> listP = k2VarU.p(str);
        if (listP == null) {
            listP = new ArrayList<>();
            k2VarU.q0(str, listP);
        }
        listP.add(function0);
        return new a(k2VarU, str, function0);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    @Override // androidx.compose.runtime.saveable.v
    @NotNull
    public Map<String, List<Object>> c() {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        k2<String, List<Object>> k2Var = this.f36428b;
        if (k2Var == null && this.f36429c == null) {
            return MapsKt.emptyMap();
        }
        int i12 = 0;
        int iV = k2Var != null ? k2Var.v() : 0;
        k2<String, List<Function0<Object>>> k2Var2 = this.f36429c;
        HashMap map = new HashMap(iV + (k2Var2 != null ? k2Var2.v() : 0));
        k2<String, List<Object>> k2Var3 = this.f36428b;
        char c11 = 7;
        long j13 = -9187201950435737472L;
        int i13 = 8;
        if (k2Var3 != null) {
            Object[] objArr = k2Var3.f12131b;
            Object[] objArr2 = k2Var3.f12132c;
            long[] jArr3 = k2Var3.f12130a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                j11 = 128;
                while (true) {
                    long j14 = jArr3[i14];
                    j12 = 255;
                    if ((((~j14) << c11) & j14 & j13) != j13) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j14 & 255) < 128) {
                                int i17 = (i14 << 3) + i16;
                                map.put((String) objArr[i17], (List) objArr2[i17]);
                            }
                            j14 >>= 8;
                            i16++;
                            c11 = c11;
                            j13 = j13;
                        }
                        c10 = c11;
                        j10 = j13;
                        if (i15 != 8) {
                            break;
                        }
                    } else {
                        c10 = c11;
                        j10 = j13;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    c11 = c10;
                    j13 = j10;
                }
            } else {
                c10 = 7;
                j10 = -9187201950435737472L;
                j11 = 128;
                j12 = 255;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        k2<String, List<Function0<Object>>> k2Var4 = this.f36429c;
        if (k2Var4 != null) {
            Object[] objArr3 = k2Var4.f12131b;
            Object[] objArr4 = k2Var4.f12132c;
            long[] jArr4 = k2Var4.f12130a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                while (true) {
                    long j15 = jArr4[i18];
                    if ((((~j15) << c10) & j15 & j10) != j10) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        int i20 = i12;
                        while (i20 < i19) {
                            if ((j15 & j12) < j11) {
                                int i21 = (i18 << 3) + i20;
                                Object obj = objArr3[i21];
                                List list = (List) objArr4[i21];
                                String str = (String) obj;
                                i11 = i13;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(i12)).invoke();
                                    if (objInvoke != null) {
                                        if (!a(objInvoke)) {
                                            throw new IllegalStateException(i.d(objInvoke).toString());
                                        }
                                        map.put(str, CollectionsKt.arrayListOf(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i12 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Function0) list.get(i12)).invoke();
                                        if (objInvoke2 != null && !a(objInvoke2)) {
                                            throw new IllegalStateException(i.d(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i12++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i11 = i13;
                            }
                            j15 >>= i11;
                            i20++;
                            i13 = i11;
                            jArr4 = jArr2;
                            i12 = 0;
                        }
                        jArr = jArr4;
                        i10 = i13;
                        if (i19 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i10 = i13;
                    }
                    if (i18 == length2) {
                        break;
                    }
                    i18++;
                    i13 = i10;
                    jArr4 = jArr;
                    i12 = 0;
                }
            }
        }
        return map;
    }

    @Override // androidx.compose.runtime.saveable.v
    @Nullable
    public Object f(@NotNull String str) {
        k2<String, List<Object>> k2Var;
        k2<String, List<Object>> k2Var2 = this.f36428b;
        List<Object> listL0 = k2Var2 != null ? k2Var2.l0(str) : null;
        List<Object> list = listL0;
        if (list != null && !list.isEmpty()) {
            if (listL0.size() > 1 && (k2Var = this.f36428b) != null) {
                k2Var.f0(str, listL0.subList(1, listL0.size()));
            }
            return listL0.get(0);
        }
        return null;
    }
}
