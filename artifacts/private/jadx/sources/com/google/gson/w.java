package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f125637a = new a("DEFAULT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f125638b = new w("STRING", 1) { // from class: com.google.gson.w.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.w
        public l l(Long l10) {
            return l10 == null ? n.f125555a : new r(l10.toString());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ w[] f125639c = k();

    final enum a extends w {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.w
        public l l(Long l10) {
            return l10 == null ? n.f125555a : new r(l10);
        }
    }

    private w(String str, int i10) {
        super(str, i10);
    }

    private static /* synthetic */ w[] k() {
        return new w[]{f125637a, f125638b};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f125639c.clone();
    }

    public abstract l l(Long l10);

    /* synthetic */ w(String str, int i10, a aVar) {
        this(str, i10);
    }
}
