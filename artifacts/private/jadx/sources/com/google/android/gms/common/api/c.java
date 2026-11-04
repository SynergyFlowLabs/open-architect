package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class c extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.a f105905a;

    public c(@NonNull androidx.collection.a aVar) {
        this.f105905a = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NonNull
    public ConnectionResult a(@NonNull k<? extends a.d> kVar) {
        androidx.collection.a aVar = this.f105905a;
        com.google.android.gms.common.api.internal.c<O> cVarK0 = kVar.k0();
        com.google.android.gms.common.internal.w.b(aVar.get(cVarK0) != null, "The given API (" + cVarK0.b() + ") was not part of the availability request.");
        return (ConnectionResult) com.google.android.gms.common.internal.w.r((ConnectionResult) this.f105905a.get(cVarK0));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NonNull
    public ConnectionResult b(@NonNull m<? extends a.d> mVar) {
        androidx.collection.a aVar = this.f105905a;
        com.google.android.gms.common.api.internal.c<O> cVarK0 = mVar.k0();
        com.google.android.gms.common.internal.w.b(aVar.get(cVarK0) != null, "The given API (" + cVarK0.b() + ") was not part of the availability request.");
        return (ConnectionResult) com.google.android.gms.common.internal.w.r((ConnectionResult) this.f105905a.get(cVarK0));
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (com.google.android.gms.common.api.internal.c cVar : this.f105905a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) com.google.android.gms.common.internal.w.r((ConnectionResult) this.f105905a.get(cVar));
            z10 &= !connectionResult.f2();
            arrayList.add(cVar.b() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
