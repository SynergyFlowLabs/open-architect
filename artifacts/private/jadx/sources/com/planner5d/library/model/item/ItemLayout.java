package com.planner5d.library.model.item;

import androidx.annotation.NonNull;
import com.canhub.cropper.core.CropImageOptions;
import com.planner5d.library.math.k;
import com.planner5d.library.math.m;

/* JADX INFO: loaded from: classes7.dex */
public class ItemLayout {
    private final m scale = new m(1.0f, 1.0f, 1.0f);
    private final m position = new m();
    private final m rotation = new m();
    private Flip flip = Flip.None;

    public enum Flip {
        None,
        Horizontal,
        Vertical,
        HorizontalVertical
    }

    public static int toRotationAngleForUser(float f10) {
        float f11 = f10 % 360.0f;
        float fRound = Math.round((f11 >= 0.0f ? CropImageOptions.S3 : 0) - f11);
        if (fRound != 360.0f && fRound != 0.0f) {
            return (int) fRound;
        }
        return 0;
    }

    public m getEdgeCenterPosition(m mVar, k kVar, k kVar2) {
        return mVar.y0(getPositionX() + (kVar.f180481b * 0.5f * kVar2.f180480a), getPositionY() + (kVar.f180481b * 0.5f * kVar2.f180481b), 0.0f);
    }

    public Flip getFlip() {
        return this.flip;
    }

    public k getPosition(k kVar) {
        m mVar = this.position;
        return kVar.U(mVar.f180482a, mVar.f180483b);
    }

    public float getPositionX() {
        return this.position.f180482a;
    }

    public float getPositionY() {
        return this.position.f180483b;
    }

    public float getPositionZ() {
        return this.position.f180484c;
    }

    public m getRotation(m mVar) {
        return mVar.A0(this.rotation);
    }

    public float getRotationX() {
        return this.rotation.f180482a;
    }

    public float getRotationY() {
        return this.rotation.f180483b;
    }

    public float getRotationZ() {
        return this.rotation.f180484c;
    }

    public k getScale(k kVar) {
        m mVar = this.scale;
        return kVar.U(mVar.f180482a, mVar.f180483b);
    }

    public float getScaleX() {
        return this.scale.f180482a;
    }

    public float getScaleY() {
        return this.scale.f180483b;
    }

    public float getScaleZ() {
        return this.scale.f180484c;
    }

    public boolean isFlippedHorizontally() {
        Flip flip = this.flip;
        if (flip != Flip.Horizontal && flip != Flip.HorizontalVertical) {
            return false;
        }
        return true;
    }

    public boolean isFlippedVertically() {
        Flip flip = this.flip;
        return flip == Flip.Vertical || flip == Flip.HorizontalVertical;
    }

    public ItemLayout offsetPosition(k kVar) {
        m mVar = this.position;
        mVar.f180482a += kVar.f180480a;
        mVar.f180483b += kVar.f180481b;
        return this;
    }

    @NonNull
    public ItemLayout set(ItemLayout itemLayout) {
        this.scale.A0(itemLayout.scale);
        this.position.A0(itemLayout.position);
        this.rotation.A0(itemLayout.rotation);
        this.flip = itemLayout.flip;
        return this;
    }

    public ItemLayout setFlip(Flip flip) {
        this.flip = flip;
        return this;
    }

    public ItemLayout setPosition(k kVar) {
        m mVar = this.position;
        mVar.f180482a = kVar.f180480a;
        mVar.f180483b = kVar.f180481b;
        return this;
    }

    public ItemLayout setPositionZ(float f10) {
        this.position.f180484c = f10;
        return this;
    }

    public ItemLayout setRotation(float f10, float f11, float f12) {
        this.rotation.y0(f10, f11, f12);
        return this;
    }

    public ItemLayout setRotationX(float f10) {
        this.rotation.f180482a = f10;
        return this;
    }

    public ItemLayout setRotationY(float f10) {
        this.rotation.f180483b = f10;
        return this;
    }

    public ItemLayout setScale(float f10, float f11) {
        return setScale(f10, f11, this.scale.f180484c);
    }

    public m getPosition(m mVar) {
        return mVar.A0(this.position);
    }

    public m getScale(m mVar) {
        return mVar.A0(this.scale);
    }

    public ItemLayout setFlip(boolean z10, boolean z11) {
        if (z10 && z11) {
            this.flip = Flip.HorizontalVertical;
            return this;
        }
        if (z10) {
            this.flip = Flip.Horizontal;
            return this;
        }
        if (z11) {
            this.flip = Flip.Vertical;
            return this;
        }
        this.flip = Flip.None;
        return this;
    }

    public ItemLayout setScale(float f10, float f11, float f12) {
        this.scale.y0(f10, f11, f12);
        return this;
    }

    public ItemLayout setPosition(float f10, float f11) {
        m mVar = this.position;
        mVar.f180482a = f10;
        mVar.f180483b = f11;
        return this;
    }

    public ItemLayout setPosition(float f10, float f11, float f12) {
        this.position.y0(f10, f11, f12);
        return this;
    }
}
