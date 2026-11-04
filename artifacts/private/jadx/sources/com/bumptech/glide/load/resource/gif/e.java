package com.bumptech.glide.load.resource.gif;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.r;

/* JADX INFO: loaded from: classes3.dex */
public class e extends com.bumptech.glide.load.resource.drawable.b<c> implements r {
    public e(c cVar) {
        super(cVar);
    }

    @Override // com.bumptech.glide.load.engine.v
    public void a() {
        ((c) this.f97110a).stop();
        ((c) this.f97110a).o();
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<c> b() {
        return c.class;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return ((c) this.f97110a).l();
    }

    @Override // com.bumptech.glide.load.resource.drawable.b, com.bumptech.glide.load.engine.r
    public void initialize() {
        ((c) this.f97110a).g().prepareToDraw();
    }
}
