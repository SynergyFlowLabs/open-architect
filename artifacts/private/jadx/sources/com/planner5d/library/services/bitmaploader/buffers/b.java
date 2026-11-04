package com.planner5d.library.services.bitmaploader.buffers;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class b extends com.planner5d.library.services.bitmaploader.buffers.a<a, Integer> {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f224105a;

        a(ByteBuffer buffer) {
            this.f224105a = buffer;
        }
    }

    public b(int buffers) {
        super(buffers);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.services.bitmaploader.buffers.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a e(a buffer, Integer size) {
        if (buffer != null && buffer.f224105a.limit() >= size.intValue()) {
            return buffer;
        }
        return new a(ByteBuffer.allocate(size.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.planner5d.library.services.bitmaploader.buffers.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void f(@NonNull a buffer) {
    }
}
