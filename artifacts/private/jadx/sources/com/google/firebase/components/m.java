package com.google.firebase.components;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f120792a = new m() { // from class: com.google.firebase.components.l
        @Override // com.google.firebase.components.m
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<g<?>> a(ComponentRegistrar componentRegistrar);
}
