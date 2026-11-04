package com.google.accompanist.permissions;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@com.google.accompanist.permissions.a
@k7
@SourceDebugExtension({"SMAP\nMutableMultiplePermissionsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,152:1\n81#2:153\n81#2:154\n81#2:155\n1549#3:156\n1620#3,3:157\n288#3,2:162\n37#4,2:160\n*S KotlinDebug\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsState\n*L\n120#1:153\n124#1:154\n129#1:155\n135#1:156\n135#1:157,3\n144#1:162,2\n135#1:160,2\n*E\n"})
public final class d implements com.google.accompanist.permissions.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f103077g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<f> f103078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<h> f103079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n7 f103080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n7 f103081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final n7 f103082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private androidx.activity.result.h<String[]> f103083f;

    @SourceDebugExtension({"SMAP\nMutableMultiplePermissionsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsState$allPermissionsGranted$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1726#2,3:153\n*S KotlinDebug\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsState$allPermissionsGranted$2\n*L\n125#1:153,3\n*E\n"})
    static final class a extends l0 implements Function0<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            boolean z10;
            List<h> listD = d.this.d();
            if ((listD instanceof Collection) && listD.isEmpty()) {
                z10 = true;
            } else {
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    if (!m.k(((h) it.next()).t())) {
                        if (d.this.a().isEmpty()) {
                            break;
                        }
                        z10 = false;
                    }
                }
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    @SourceDebugExtension({"SMAP\nMutableMultiplePermissionsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsState$revokedPermissions$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n766#2:153\n857#2,2:154\n*S KotlinDebug\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsState$revokedPermissions$2\n*L\n121#1:153\n121#1:154,2\n*E\n"})
    static final class b extends l0 implements Function0<List<? extends h>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<h> invoke() {
            List<h> listD = d.this.d();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                if (!Intrinsics.areEqual(((h) obj).t(), j.b.f103112a)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @SourceDebugExtension({"SMAP\nMutableMultiplePermissionsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsState$shouldShowRationale$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1747#2,3:153\n*S KotlinDebug\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsState$shouldShowRationale$2\n*L\n130#1:153,3\n*E\n"})
    static final class c extends l0 implements Function0<Boolean> {
        c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            List<h> listD = d.this.d();
            boolean z10 = false;
            if (!(listD instanceof Collection) || !listD.isEmpty()) {
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    if (m.i(((h) it.next()).t())) {
                        z10 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    public d(@NotNull List<f> mutablePermissions) {
        Intrinsics.checkNotNullParameter(mutablePermissions, "mutablePermissions");
        this.f103078a = mutablePermissions;
        this.f103079b = mutablePermissions;
        this.f103080c = w6.e(new b());
        this.f103081d = w6.e(new a());
        this.f103082e = w6.e(new c());
    }

    @Override // com.google.accompanist.permissions.b
    @NotNull
    public List<h> a() {
        return (List) this.f103080c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.accompanist.permissions.b
    public void b() {
        Unit unit;
        androidx.activity.result.h<String[]> hVar = this.f103083f;
        if (hVar != 0) {
            List<h> listD = d();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).F7());
            }
            hVar.b(arrayList.toArray(new String[0]));
            unit = Unit.f312394a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
    }

    @Override // com.google.accompanist.permissions.b
    public boolean c() {
        return ((Boolean) this.f103082e.getValue()).booleanValue();
    }

    @Override // com.google.accompanist.permissions.b
    @NotNull
    public List<h> d() {
        return this.f103079b;
    }

    @Override // com.google.accompanist.permissions.b
    public boolean e() {
        return ((Boolean) this.f103081d.getValue()).booleanValue();
    }

    @Nullable
    public final androidx.activity.result.h<String[]> f() {
        return this.f103083f;
    }

    public final void g(@Nullable androidx.activity.result.h<String[]> hVar) {
        this.f103083f = hVar;
    }

    public final void h(@NotNull Map<String, Boolean> permissionsStatus) {
        Object next;
        Intrinsics.checkNotNullParameter(permissionsStatus, "permissionsStatus");
        for (String str : permissionsStatus.keySet()) {
            Iterator<T> it = this.f103078a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((f) next).F7(), str));
            f fVar = (f) next;
            if (fVar != null && permissionsStatus.get(str) != null) {
                fVar.c();
            }
        }
    }
}
