<template>
  <div class="footer mt10">
    CopyRight 2023 LJC AllRights Reserved
  </div>
</template>

<style type="text/scss" scoped lang="scss">
.footer {
  padding: 15px;
  color: #767676;
  text-align: center;
  .link {
    a:after {
      content: " | ";
    }
    a:last-child:after {
      content: "";
    }
  }
}
</style>
<script>
import api from "@/api";
import { extend } from "@/utils/extend";
const setting = require("@/setting");

export default {
  data() {
    return {
      likeList: [],
    };
  },
  methods: {
    loadListMenu(module, target) {
      this.$post(api.search.all, { table: module, order: "id desc" }).then(
        (res) => {
          this[target] = res.data;
        }
      );
    },
  },
  created() {
    this.loadListMenu("youqinglianjie", "likeList");
  },
};
</script>
