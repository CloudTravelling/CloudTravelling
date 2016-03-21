/**
 *  created by glcsnz123
 *
 */
angular.module('education.switchCtrl', [])
  .controller('switchCtrl.characterCtrl', function ($scope, educationService) {

    $scope.characters = [
      {
        id: 1,
        name: "实时公交",
        desc: "查询实时公交状况",
        sref: "education.stcourse",
        imageUrl: "img/Education/bus.png",
        title: "实时公交",
      },
      {
        id: 2,
        name: "实时路况",
        desc: "查询实时道路状况",
        sref: "education.temanager",
        imageUrl: "img/Education/road.png",
        title: "实时路况",
      },
      {
        id: 3,
        name: "出行贴士",
        desc: "查询今日出行小贴士",
        sref: "education.school",
        imageUrl: "img/Education/tips.png",
        title: "关于云行",
      },
    ];
    educationService.setCharacterType(0);
    educationService.refreshRootMenu();
    $scope.clickAt = function (inx) {
      $scope.viewTitle = $scope.characters[inx - 1].title;
      educationService.setCharacterType(parseInt(inx));
      educationService.refreshRootMenu();
    }
  });



