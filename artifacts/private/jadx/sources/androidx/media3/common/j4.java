package androidx.media3.common;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j4 f60790a = new a();

    class a implements j4 {

        /* JADX INFO: renamed from: androidx.media3.common.j4$a$a, reason: collision with other inner class name */
        class C0570a implements u0 {
            C0570a() {
            }
        }

        a() {
        }

        @Override // androidx.media3.common.j4
        public androidx.media3.common.util.r0 a(List<androidx.media3.common.util.r0> list) {
            return list.get(0);
        }

        @Override // androidx.media3.common.j4
        public u0 b(int i10, long j10) {
            return new C0570a();
        }
    }

    androidx.media3.common.util.r0 a(List<androidx.media3.common.util.r0> list);

    u0 b(int i10, long j10);
}
