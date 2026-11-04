package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class f4 {

    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f50322a;

        a(final u val$input) {
            this.f50322a = val$input;
        }

        @Override // androidx.datastore.preferences.protobuf.f4.c
        public byte a(int offset) {
            return this.f50322a.m(offset);
        }

        @Override // androidx.datastore.preferences.protobuf.f4.c
        public int size() {
            return this.f50322a.size();
        }
    }

    class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f50323a;

        b(final byte[] val$input) {
            this.f50323a = val$input;
        }

        @Override // androidx.datastore.preferences.protobuf.f4.c
        public byte a(int offset) {
            return this.f50323a[offset];
        }

        @Override // androidx.datastore.preferences.protobuf.f4.c
        public int size() {
            return this.f50323a.length;
        }
    }

    private interface c {
        byte a(int offset);

        int size();
    }

    private f4() {
    }

    static String a(final u input) {
        return b(new a(input));
    }

    static String b(c input) {
        StringBuilder sb2 = new StringBuilder(input.size());
        for (int i10 = 0; i10 < input.size(); i10++) {
            byte bA = input.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String c(final byte[] input) {
        return b(new b(input));
    }

    static String d(String input) {
        return input.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String e(String input) {
        return a(u.C(input));
    }
}
