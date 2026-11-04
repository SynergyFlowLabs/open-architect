package com.google.common.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@i
@com.google.common.annotations.b
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f116977a = new a("EXPLICIT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f116978b = new v("REPLACED", 1) { // from class: com.google.common.cache.v.b
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.v
        boolean l() {
            return false;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f116979c = new v("COLLECTED", 2) { // from class: com.google.common.cache.v.c
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.v
        boolean l() {
            return true;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f116980d = new v("EXPIRED", 3) { // from class: com.google.common.cache.v.d
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.v
        boolean l() {
            return true;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f116981e = new v("SIZE", 4) { // from class: com.google.common.cache.v.e
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.v
        boolean l() {
            return true;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ v[] f116982f = k();

    final enum a extends v {
        a(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }

        @Override // com.google.common.cache.v
        boolean l() {
            return false;
        }
    }

    static {
        int i10 = 5 | 3;
    }

    private v(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    private static /* synthetic */ v[] k() {
        return new v[]{f116977a, f116978b, f116979c, f116980d, f116981e};
    }

    public static v valueOf(String name) {
        return (v) Enum.valueOf(v.class, name);
    }

    public static v[] values() {
        return (v[]) f116982f.clone();
    }

    abstract boolean l();

    /* synthetic */ v(String str, int i10, a aVar) {
        this(str, i10);
    }
}
