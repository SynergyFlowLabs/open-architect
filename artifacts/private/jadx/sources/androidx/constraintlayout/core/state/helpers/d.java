package androidx.constraintlayout.core.state.helpers;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.constraintlayout.core.state.k;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class d extends androidx.constraintlayout.core.state.f {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    protected float f44288q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    @Deprecated
    protected HashMap<String, Float> f44289r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    @Deprecated
    protected HashMap<String, Float> f44290s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NonNull
    @Deprecated
    protected HashMap<String, Float> f44291t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private HashMap<String, Float> f44292u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private HashMap<String, Float> f44293v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NonNull
    protected k.a f44294w0;

    public d(@NonNull k kVar, @NonNull k.d dVar) {
        super(kVar, dVar);
        this.f44288q0 = 0.5f;
        this.f44289r0 = new HashMap<>();
        this.f44290s0 = new HashMap<>();
        this.f44291t0 = new HashMap<>();
        this.f44294w0 = k.a.SPREAD;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void U0(@NonNull Object obj, float f10, float f11, float f12, float f13, float f14) {
        super.P0(obj);
        String string = obj.toString();
        if (!Float.isNaN(f10)) {
            this.f44289r0.put(string, Float.valueOf(f10));
        }
        if (!Float.isNaN(f11)) {
            this.f44290s0.put(string, Float.valueOf(f11));
        }
        if (!Float.isNaN(f12)) {
            this.f44291t0.put(string, Float.valueOf(f12));
        }
        if (!Float.isNaN(f13)) {
            if (this.f44292u0 == null) {
                this.f44292u0 = new HashMap<>();
            }
            this.f44292u0.put(string, Float.valueOf(f13));
        }
        if (Float.isNaN(f14)) {
            return;
        }
        if (this.f44293v0 == null) {
            this.f44293v0 = new HashMap<>();
        }
        this.f44293v0.put(string, Float.valueOf(f14));
    }

    public void V0(@NonNull String str, float f10, float f11, float f12) {
        U0(str, f10, f11, f12, 0.0f, 0.0f);
    }

    @Override // androidx.constraintlayout.core.state.a
    @NonNull
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public d n(float f10) {
        this.f44288q0 = f10;
        return this;
    }

    public float X0() {
        return this.f44288q0;
    }

    float Y0(@NonNull String str) {
        HashMap<String, Float> map = this.f44293v0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.f44293v0.get(str).floatValue();
    }

    protected float Z0(@NonNull String str) {
        if (this.f44291t0.containsKey(str)) {
            return this.f44291t0.get(str).floatValue();
        }
        return 0.0f;
    }

    float a1(@NonNull String str) {
        HashMap<String, Float> map = this.f44292u0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return this.f44292u0.get(str).floatValue();
    }

    protected float b1(@NonNull String str) {
        if (this.f44290s0.containsKey(str)) {
            return this.f44290s0.get(str).floatValue();
        }
        return 0.0f;
    }

    @NonNull
    public k.a c1() {
        return k.a.SPREAD;
    }

    protected float d1(@NonNull String str) {
        if (this.f44289r0.containsKey(str)) {
            return this.f44289r0.get(str).floatValue();
        }
        return -1.0f;
    }

    @NonNull
    public d e1(@NonNull k.a aVar) {
        this.f44294w0 = aVar;
        return this;
    }
}
