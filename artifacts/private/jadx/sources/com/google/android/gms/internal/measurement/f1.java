package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class f1 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f108406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f108407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f108408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ g1 f108409d;

    /* synthetic */ f1(g1 g1Var, byte[] bArr) {
        Objects.requireNonNull(g1Var);
        this.f108409d = g1Var;
        this.f108406a = false;
        this.f108407b = new HashSet();
        this.f108408c = new HashMap();
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f108408c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f108406a = true;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f108406a) {
            this.f108409d.a().clear();
        }
        g1 g1Var = this.f108409d;
        Set set = this.f108407b;
        g1Var.a().keySet().removeAll(set);
        Map map = this.f108408c;
        for (Map.Entry entry : map.entrySet()) {
            g1Var.a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : g1Var.b()) {
            com.google.common.collect.nb it = com.google.common.collect.z9.O(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(g1Var, (String) it.next());
            }
        }
        return (!this.f108406a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f108407b.add(str);
        return this;
    }
}
