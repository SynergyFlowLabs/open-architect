package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.fg;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f109976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f109977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f109978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k6 f109979d;

    public g6(k6 k6Var, String str, Bundle bundle) {
        Objects.requireNonNull(k6Var);
        this.f109979d = k6Var;
        com.google.android.gms.common.internal.w.l(str);
        this.f109976a = str;
        this.f109977b = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    @androidx.annotation.m1
    public final Bundle a() {
        byte b10;
        if (this.f109978c == null) {
            k6 k6Var = this.f109979d;
            String string = k6Var.p().getString(this.f109976a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b10 = 4;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b10 = 3;
                                        } else {
                                            b10 = -1;
                                        }
                                    } else if (string3.equals("s")) {
                                        b10 = 0;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (string3.equals(androidx.media3.exoplayer.upstream.h.f65996j)) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                            } else if (string3.equals("d")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            if (b10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b10 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (b10 == 3) {
                                fg.a();
                                if (k6Var.f110184a.w().H(null, z4.R0)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i11 = 0; i11 < length; i11++) {
                                        iArr[i11] = jSONArray2.optInt(i11);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (b10 != 4) {
                                k6Var.f110184a.a().o().b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                fg.a();
                                if (k6Var.f110184a.w().H(null, z4.R0)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i12 = 0; i12 < length2; i12++) {
                                        jArr[i12] = jSONArray3.optLong(i12);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f109979d.f110184a.a().o().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f109978c = bundle;
                } catch (JSONException unused2) {
                    this.f109979d.f110184a.a().o().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f109978c == null) {
                this.f109978c = this.f109977b;
            }
        }
        return new Bundle((Bundle) com.google.android.gms.common.internal.w.r(this.f109978c));
    }

    @androidx.annotation.m1
    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        k6 k6Var = this.f109979d;
        SharedPreferences.Editor editorEdit = k6Var.p().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.f109976a);
        } else {
            String str = this.f109976a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        fg.a();
                        h7 h7Var = k6Var.f110184a;
                        if (h7Var.w().H(null, z4.R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", androidx.media3.exoplayer.upstream.h.f65996j);
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                h7Var.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", androidx.media3.exoplayer.upstream.h.f65996j);
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                h7Var.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        this.f109979d.f110184a.a().o().b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f109978c = bundle2;
    }
}
