#!/bin/bash
HUGO_DIR="$PWD"
cd ..
find ./ -not -path "*.git*" -not -name "CNAME" -not -path "*__hugo_web*" | tail -n+2 | xargs rm -rf
cd $HUGO_DIR
hugo -d hugo_tmp --theme="liquorice"
mv hugo_tmp/* ../
rm -rf hugo_tmp
rm -rf public
cd ..
git add -A .

