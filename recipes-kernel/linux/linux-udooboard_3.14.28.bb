# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-udooboard.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# UDOOboard branch - based on 3.14.28_1.0.0_ga from Freescale git

SRCBRANCH = "3.14-1.0.x-udoo"
SRCREV = "2a21526f9f5c030fb5c07491474d612dc16ef386"
LOCALVERSION = "_1.0.0_ga-udooboard"

B = "${S}"

COMPATIBLE_MACHINE = "(udooneo|udooqdl)"
