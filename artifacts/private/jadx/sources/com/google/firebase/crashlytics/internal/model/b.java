package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
final class b extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f121495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f121496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f121497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f121498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f121499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f121500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f121501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f121502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f121503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f0.f f121504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f0.e f121505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final f0.a f121506m;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.b$b, reason: collision with other inner class name */
    static final class C1128b extends f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f121507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f121508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f121509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f121510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f121511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f121512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f121513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f121514h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f121515i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f0.f f121516j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private f0.e f121517k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private f0.a f121518l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f121519m;

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0 a() {
            if (this.f121519m == 1 && this.f121507a != null && this.f121508b != null && this.f121510d != null && this.f121514h != null && this.f121515i != null) {
                return new b(this.f121507a, this.f121508b, this.f121509c, this.f121510d, this.f121511e, this.f121512f, this.f121513g, this.f121514h, this.f121515i, this.f121516j, this.f121517k, this.f121518l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f121507a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f121508b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f121519m) == 0) {
                sb2.append(" platform");
            }
            if (this.f121510d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f121514h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f121515i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c b(f0.a aVar) {
            this.f121518l = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c c(@p0 String str) {
            this.f121513g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f121514h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f121515i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c f(@p0 String str) {
            this.f121512f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c g(@p0 String str) {
            this.f121511e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f121508b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f121510d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c j(f0.e eVar) {
            this.f121517k = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c k(int i10) {
            this.f121509c = i10;
            this.f121519m = (byte) (this.f121519m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f121507a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.c
        public f0.c m(f0.f fVar) {
            this.f121516j = fVar;
            return this;
        }

        C1128b() {
        }

        private C1128b(f0 f0Var) {
            this.f121507a = f0Var.m();
            this.f121508b = f0Var.i();
            this.f121509c = f0Var.l();
            this.f121510d = f0Var.j();
            this.f121511e = f0Var.h();
            this.f121512f = f0Var.g();
            this.f121513g = f0Var.d();
            this.f121514h = f0Var.e();
            this.f121515i = f0Var.f();
            this.f121516j = f0Var.n();
            this.f121517k = f0Var.k();
            this.f121518l = f0Var.c();
            this.f121519m = (byte) 1;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @p0
    public f0.a c() {
        return this.f121506m;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @p0
    public String d() {
        return this.f121501h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @NonNull
    public String e() {
        return this.f121502i;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea A[RETURN] */
    public boolean equals(Object obj) {
        String str;
        String str2;
        f0.f fVar;
        f0.e eVar;
        f0.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f121495b.equals(f0Var.m()) && this.f121496c.equals(f0Var.i()) && this.f121497d == f0Var.l() && this.f121498e.equals(f0Var.j()) && ((str = this.f121499f) != null ? str.equals(f0Var.h()) : f0Var.h() == null)) {
                String str3 = this.f121500g;
                if (str3 == null) {
                    if (f0Var.g() == null) {
                        str2 = this.f121501h;
                        if (str2 == null ? str2.equals(f0Var.d()) : f0Var.d() == null) {
                            if (this.f121502i.equals(f0Var.e()) && this.f121503j.equals(f0Var.f())) {
                                fVar = this.f121504k;
                                if (fVar == null) {
                                    if (f0Var.n() == null) {
                                        eVar = this.f121505l;
                                        if (eVar == null) {
                                            if (f0Var.k() == null) {
                                                aVar = this.f121506m;
                                                if (aVar == null) {
                                                    if (f0Var.c() == null) {
                                                        return true;
                                                    }
                                                } else if (aVar.equals(f0Var.c())) {
                                                    return true;
                                                }
                                            }
                                        } else if (eVar.equals(f0Var.k())) {
                                            aVar = this.f121506m;
                                            if (aVar == null) {
                                                if (f0Var.c() == null) {
                                                    return true;
                                                }
                                            } else if (aVar.equals(f0Var.c())) {
                                                return true;
                                            }
                                        }
                                    }
                                } else if (fVar.equals(f0Var.n())) {
                                    eVar = this.f121505l;
                                    if (eVar == null) {
                                        if (f0Var.k() == null) {
                                            aVar = this.f121506m;
                                            if (aVar == null) {
                                                if (f0Var.c() == null) {
                                                    return true;
                                                }
                                            } else if (aVar.equals(f0Var.c())) {
                                                return true;
                                            }
                                        }
                                    } else if (eVar.equals(f0Var.k())) {
                                        aVar = this.f121506m;
                                        if (aVar == null) {
                                            if (f0Var.c() == null) {
                                                return true;
                                            }
                                        } else if (aVar.equals(f0Var.c())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (str3.equals(f0Var.g())) {
                    str2 = this.f121501h;
                    if (str2 == null) {
                        if (this.f121502i.equals(f0Var.e())) {
                            fVar = this.f121504k;
                            if (fVar == null) {
                                if (f0Var.n() == null) {
                                    eVar = this.f121505l;
                                    if (eVar == null) {
                                        if (f0Var.k() == null) {
                                            aVar = this.f121506m;
                                            if (aVar == null) {
                                                if (f0Var.c() == null) {
                                                    return true;
                                                }
                                            } else if (aVar.equals(f0Var.c())) {
                                                return true;
                                            }
                                        }
                                    } else if (eVar.equals(f0Var.k())) {
                                        aVar = this.f121506m;
                                        if (aVar == null) {
                                            if (f0Var.c() == null) {
                                                return true;
                                            }
                                        } else if (aVar.equals(f0Var.c())) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (fVar.equals(f0Var.n())) {
                                eVar = this.f121505l;
                                if (eVar == null) {
                                    if (f0Var.k() == null) {
                                        aVar = this.f121506m;
                                        if (aVar == null) {
                                            if (f0Var.c() == null) {
                                                return true;
                                            }
                                        } else if (aVar.equals(f0Var.c())) {
                                            return true;
                                        }
                                    }
                                } else if (eVar.equals(f0Var.k())) {
                                    aVar = this.f121506m;
                                    if (aVar == null) {
                                        if (f0Var.c() == null) {
                                            return true;
                                        }
                                    } else if (aVar.equals(f0Var.c())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else if (this.f121502i.equals(f0Var.e())) {
                        fVar = this.f121504k;
                        if (fVar == null) {
                            if (f0Var.n() == null) {
                                eVar = this.f121505l;
                                if (eVar == null) {
                                    if (f0Var.k() == null) {
                                        aVar = this.f121506m;
                                        if (aVar == null) {
                                            if (f0Var.c() == null) {
                                                return true;
                                            }
                                        } else if (aVar.equals(f0Var.c())) {
                                            return true;
                                        }
                                    }
                                } else if (eVar.equals(f0Var.k())) {
                                    aVar = this.f121506m;
                                    if (aVar == null) {
                                        if (f0Var.c() == null) {
                                            return true;
                                        }
                                    } else if (aVar.equals(f0Var.c())) {
                                        return true;
                                    }
                                }
                            }
                        } else if (fVar.equals(f0Var.n())) {
                            eVar = this.f121505l;
                            if (eVar == null) {
                                if (f0Var.k() == null) {
                                    aVar = this.f121506m;
                                    if (aVar == null) {
                                        if (f0Var.c() == null) {
                                            return true;
                                        }
                                    } else if (aVar.equals(f0Var.c())) {
                                        return true;
                                    }
                                }
                            } else if (eVar.equals(f0Var.k())) {
                                aVar = this.f121506m;
                                if (aVar == null) {
                                    if (f0Var.c() == null) {
                                        return true;
                                    }
                                } else if (aVar.equals(f0Var.c())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @NonNull
    public String f() {
        return this.f121503j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @p0
    public String g() {
        return this.f121500g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @p0
    public String h() {
        return this.f121499f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f121495b.hashCode() ^ 1000003) * 1000003) ^ this.f121496c.hashCode()) * 1000003) ^ this.f121497d) * 1000003) ^ this.f121498e.hashCode()) * 1000003;
        String str = this.f121499f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f121500g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f121501h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f121502i.hashCode()) * 1000003) ^ this.f121503j.hashCode()) * 1000003;
        f0.f fVar = this.f121504k;
        int iHashCode5 = (iHashCode4 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        f0.e eVar = this.f121505l;
        int iHashCode6 = (iHashCode5 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.a aVar = this.f121506m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @NonNull
    public String i() {
        return this.f121496c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @NonNull
    public String j() {
        return this.f121498e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @p0
    public f0.e k() {
        return this.f121505l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    public int l() {
        return this.f121497d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @NonNull
    public String m() {
        return this.f121495b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    @p0
    public f0.f n() {
        return this.f121504k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0
    protected f0.c p() {
        return new C1128b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f121495b + ", gmpAppId=" + this.f121496c + ", platform=" + this.f121497d + ", installationUuid=" + this.f121498e + ", firebaseInstallationId=" + this.f121499f + ", firebaseAuthenticationToken=" + this.f121500g + ", appQualitySessionId=" + this.f121501h + ", buildVersion=" + this.f121502i + ", displayVersion=" + this.f121503j + ", session=" + this.f121504k + ", ndkPayload=" + this.f121505l + ", appExitInfo=" + this.f121506m + "}";
    }

    private b(String str, String str2, int i10, String str3, @p0 String str4, @p0 String str5, @p0 String str6, String str7, String str8, @p0 f0.f fVar, @p0 f0.e eVar, @p0 f0.a aVar) {
        this.f121495b = str;
        this.f121496c = str2;
        this.f121497d = i10;
        this.f121498e = str3;
        this.f121499f = str4;
        this.f121500g = str5;
        this.f121501h = str6;
        this.f121502i = str7;
        this.f121503j = str8;
        this.f121504k = fVar;
        this.f121505l = eVar;
        this.f121506m = aVar;
    }
}
