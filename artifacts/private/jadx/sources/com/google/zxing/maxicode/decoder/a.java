package com.google.zxing.maxicode.decoder;

import androidx.compose.material3.os;
import androidx.compose.runtime.m0;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.view.f0;
import androidx.media2.widget.f;
import androidx.media3.exoplayer.a5;
import com.canhub.cropper.core.CropImageOptions;
import com.facebook.internal.p;
import com.google.android.material.internal.p0;
import com.google.android.vending.licensing.k;
import com.google.api.client.http.a0;
import com.planner5d.planner5d.n;
import io.sentry.r0;
import okhttp3.internal.ws.g;

/* JADX INFO: loaded from: classes5.dex */
final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f130499b = {new int[]{121, 120, 127, g.f334652s, 133, 132, 139, 138, 145, 144, 151, 150, f.i.f59799s0, f.i.f59797r0, 163, 162, 169, 168, 175, 174, 181, 180, 187, 186, 193, 192, 199, 198, -2, -2}, new int[]{123, 122, 129, 128, 135, 134, f.i.f59775g0, f.i.f59773f0, com.planner5d.library.engine.input.f.b.F1, 146, 153, 152, 159, f.i.f59801t0, 165, 164, 171, 170, 177, 176, 183, 182, 189, 188, 195, 194, 201, 200, 816, -3}, new int[]{125, 124, 131, 130, f.i.f59767c0, 136, 143, f.i.f59777h0, com.planner5d.library.engine.input.f.b.H1, com.planner5d.library.engine.input.f.b.G1, 155, f.i.f59793p0, 161, 160, 167, 166, 173, 172, 179, 178, 185, 184, 191, p.f100029m, 197, 196, 203, 202, 818, 817}, new int[]{283, 282, 277, 276, 271, 270, 265, 264, 259, 258, com.planner5d.library.engine.input.f.b.W1, com.planner5d.library.engine.input.f.b.V1, com.planner5d.library.engine.input.f.b.Q1, com.planner5d.library.engine.input.f.b.P1, 241, 240, 235, 234, 229, 228, 223, 222, 217, 216, 211, 210, 205, 204, 819, -3}, new int[]{285, 284, 279, 278, com.badlogic.gdx.utils.compression.lzma.a.A, com.badlogic.gdx.utils.compression.lzma.a.f95331z, 267, 266, 261, com.planner5d.library.engine.input.b.f160571z3, 255, com.planner5d.library.engine.input.f.b.X1, com.planner5d.library.engine.input.f.b.S1, com.planner5d.library.engine.input.f.b.R1, com.planner5d.library.engine.input.f.b.M1, 242, 237, 236, 231, 230, 225, 224, 219, 218, 213, 212, m0.f36245r, 206, 821, 820}, new int[]{287, 286, 281, 280, 275, 274, 269, 268, 263, 262, 257, 256, com.planner5d.library.engine.input.f.b.U1, 250, com.planner5d.library.engine.input.f.b.O1, 244, 239, 238, 233, 232, 227, 226, 221, 220, 215, 214, 209, 208, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, 307, 306, 313, 312, 319, v.a.f43976s, 325, 324, 331, 330, 337, 336, 343, 342, 349, 348, 355, 354, 361, CropImageOptions.S3, 367, 366, 824, 823}, new int[]{k.f115074c, 290, 297, 296, 303, 302, 309, 308, 315, 314, 321, com.rabbitmq.client.a.f264844o, 327, 326, 333, 332, 339, 338, 345, 344, 351, 350, 357, 356, 363, 362, 369, 368, 825, -3}, new int[]{293, 292, 299, 298, 305, 304, 311, 310, v.a.f43975r, v.a.f43974q, 323, 322, 329, 328, 335, 334, p.f100031o, 340, 347, 346, 353, 352, 359, 358, 365, 364, 371, 370, 827, 826}, new int[]{a0.f115563p, 408, 403, 402, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, a5.S0, 379, 378, 373, 372, 828, -3}, new int[]{411, 410, 405, 404, 399, 398, 393, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, com.rabbitmq.client.impl.k.b.p.f265340a, 110, 387, 386, 381, 380, 375, 374, 830, 829}, new int[]{413, 412, 407, com.rabbitmq.client.a.f264843n, 401, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, com.planner5d.library.engine.input.f.b.B, 389, 388, 383, 382, 377, 376, 831, -3}, new int[]{415, 414, 421, v.c.f44017r, 427, 426, com.planner5d.library.engine.input.f.b.f160733u1, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, 445, 444, 833, 832}, new int[]{417, v.c.f44016q, v.c.f44020u, 422, 429, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, 435, 434, 441, 440, 447, 446, 834, -3}, new int[]{419, 418, v.c.f44022w, v.c.f44021v, 431, 430, com.planner5d.library.engine.input.f.b.f160745y1, com.planner5d.library.engine.input.f.b.f160742x1, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, 437, 436, 443, 442, 449, 448, 836, 835}, new int[]{481, 480, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, 451, 450, 837, -3}, new int[]{483, 482, 477, 476, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, p.f100032p, 453, 452, 839, 838}, new int[]{485, 484, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, 460, 455, 454, 840, -3}, new int[]{487, 486, p.f100033q, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, 505, 504, 511, v.g.f44098r, 517, 516, 842, 841}, new int[]{489, 488, 495, 494, 501, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, v.g.f44095o, 506, f0.f48707j, 512, 519, 518, 843, -3}, new int[]{491, 490, 497, 496, 503, 502, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, v.g.f44096p, com.badlogic.gdx.graphics.g3d.shaders.b.f94481i4, 514, 521, 520, 845, 844}, new int[]{559, 558, 553, 552, 547, 546, com.rabbitmq.client.a.f264854y, com.rabbitmq.client.a.f264853x, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, 535, 534, 529, 528, 523, 522, 846, -3}, new int[]{k.f115073b, 560, 555, 554, 549, 548, 543, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, me.relex.circleindicator.a.f332619e, androidx.media3.extractor.metadata.dvbsi.b.f67479d, 537, 536, 531, com.rabbitmq.client.a.f264852w, 525, 524, 848, 847}, new int[]{563, 562, 557, 556, 551, 550, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, 533, 532, 527, 526, 849, -3}, new int[]{565, 564, 571, 570, 577, 576, 583, 582, 589, 588, 595, 594, 601, 600, v.e.f44054w, v.e.f44053v, 613, v.e.B, 619, 618, 625, 624, 631, 630, 637, 636, 643, 642, 851, 850}, new int[]{567, 566, 573, 572, 579, 578, 585, 584, 591, 590, 597, 596, v.e.f44050s, v.e.f44049r, v.e.f44056y, v.e.f44055x, 615, 614, 621, 620, 627, 626, n.f264532d, 632, 639, 638, 645, 644, 852, -3}, new int[]{569, 568, 575, 574, 581, 580, 587, 586, 593, 592, r0.f306611d, 598, v.e.f44052u, v.e.f44051t, v.e.A, v.e.f44057z, 617, 616, 623, 622, 629, 628, 635, 634, 641, 640, 647, 646, 854, 853}, new int[]{727, 726, 721, 720, 715, 714, 709, 708, 703, 702, 697, 696, 691, 690, 685, 684, 679, 678, 673, 672, 667, com.planner5d.library.widget.editor.editor2d.drawable.c.f254878a, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, v.h.f44114o, 704, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, os.f31455l, 857, 856}, new int[]{731, 730, 725, 724, androidx.media3.exoplayer.trackselection.a.F, 718, 713, 712, v.h.f44116q, v.h.f44115p, 701, 700, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, com.planner5d.library.widget.editor.editor2d.drawable.c.f254879b, 664, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, 750, 757, 756, 763, 762, 769, p0.f112892a, 775, 774, 781, 780, 787, 786, 793, 792, 799, 798, 805, 804, 811, 810, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, 765, 764, 771, 770, 777, 776, 783, 782, 789, 788, 795, 794, 801, 800, 807, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, 773, 772, 779, 778, 785, 784, 791, 790, 797, 796, 803, 802, 809, 808, 815, 814, 863, 862}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f130500a;

    a(com.google.zxing.common.b bVar) {
        this.f130500a = bVar;
    }

    byte[] a() {
        byte[] bArr = new byte[144];
        int iH = this.f130500a.h();
        int iL = this.f130500a.l();
        for (int i10 = 0; i10 < iH; i10++) {
            int[] iArr = f130499b[i10];
            for (int i11 = 0; i11 < iL; i11++) {
                int i12 = iArr[i11];
                if (i12 >= 0 && this.f130500a.e(i11, i10)) {
                    int i13 = i12 / 6;
                    bArr[i13] = (byte) (((byte) (1 << (5 - (i12 % 6)))) | bArr[i13]);
                }
            }
        }
        return bArr;
    }
}
