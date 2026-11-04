package w4;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.util.k;

/* JADX INFO: loaded from: classes3.dex */
public class b implements v<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f385918a;

    public b(byte[] bArr) {
        this.f385918a = (byte[]) k.d(bArr);
    }

    @Override // com.bumptech.glide.load.engine.v
    public void a() {
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<byte[]> b() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f385918a;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return this.f385918a.length;
    }
}
