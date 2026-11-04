package io.customer.messaginginapp.ui.controller;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
@Target({})
@Retention(RetentionPolicy.SOURCE)
@jj.f(allowedTargets = {jj.b.PROPERTY})
@jj.e(jj.a.SOURCE)
public @interface ThreadSafeProperty {
    String reason() default "Accessed from multiple threads";
}
